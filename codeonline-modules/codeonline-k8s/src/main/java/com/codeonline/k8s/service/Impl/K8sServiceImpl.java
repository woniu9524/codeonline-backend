package com.codeonline.k8s.service.Impl;

import com.alibaba.nacos.shaded.com.google.gson.Gson;
import com.codeonline.common.core.constant.K8sConstants;
import com.codeonline.common.core.utils.StringUtils;
import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.k8s.mapper.K8sMapper;
import com.codeonline.k8s.model.*;
import com.codeonline.k8s.model.vo.K8sConfigureVo;
import com.codeonline.k8s.service.IK8sService;
import com.codeonline.k8s.shell.ShellMan;
import com.codeonline.k8s.utils.K8sUtil;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/8 3:10 星期日
 * @Description:
 */
@Service
public class K8sServiceImpl implements IK8sService {
    @Autowired
    private K8sUtil k8sUtil;

    @Autowired
    private ShellMan shellMan;

    @Value("${harbor.harborUrl}")
    private String harborUrl;
    @Value("${harbor.harborSpace}")
    private String harborSpace;
    @Value("${nfs.server}")
    private String nfsServer;
    @Value("${nfs.path}")
    private String nfsPath;

    @Autowired
    private K8sMapper k8sMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult createK8sConfigure(K8sConfigureVo k8sConfigureVo) {
        K8sConfigure k8sConfigure;
        // 使用Gson通过序列化的方式将k8sConfigureVo转换为k8sConfigure
        k8sConfigure= new Gson().fromJson(new Gson().toJson(k8sConfigureVo),K8sConfigure.class);
        // 将k8sConfigure转成json字符串
        String configure = new Gson().toJson(k8sConfigure);
        K8sConfigureJson k8sConfigureJson = new K8sConfigureJson();
        k8sConfigureJson.setConfigure(configure);
        // 查询是否已经存在
        Long id = k8sMapper.selectK8sConfigure(k8sConfigureJson);
        if (id != null){
            k8sConfigureJson.setId(id);
        }else {
            // 将json字符串插入数据库
            k8sMapper.insertK8sConfigure(k8sConfigureJson);
        }
        K8sConfigureRelation k8sConfigureRelation = new K8sConfigureRelation();
        k8sConfigureRelation.setUserId(k8sConfigureVo.getUserId());
        k8sConfigureRelation.setConfigureId(k8sConfigureJson.getId());
        k8sConfigureRelation.setHasPublic(k8sConfigureVo.isHasPublic());
        k8sConfigureRelation.setLabId(k8sConfigureVo.getLabId());
        // 将关系插入数据库
        k8sMapper.insertK8sConfigureRelation(k8sConfigureRelation);

        return AjaxResult.success();

    }

    @Override
    public AjaxResult createK8sDeploy(String labId) throws IOException {
        // 读取配置文件
        String k8sConfigureJsonString = k8sMapper.selectK8sConfigureByLabId(labId);
        // 将json字符串转换为k8sConfigure
        K8sConfigure k8sConfigure = new Gson().fromJson(k8sConfigureJsonString,K8sConfigure.class);
        // 读取teacherId
        Long teacherId = k8sMapper.selectUserIdByLabId(labId);
        // 读取userId
        Long studentId = SecurityUtils.getUserId();
        String studentName = SecurityUtils.getUsername();
        // 创建k8s部署
        Deployment deployment = k8sUtil.createDeployment(populateDeployment(k8sConfigure, labId, teacherId, studentId));
        if(deployment==null){
            return AjaxResult.error("创建失败");
        }
        // 创建k8s服务
        io.fabric8.kubernetes.api.model.Service service = null;
        if(!k8sConfigure.getPorts().isEmpty()){
            service = k8sUtil.createService(populateService(k8sConfigure, labId, teacherId, studentId));
            if(service==null){
                k8sUtil.deleteDeployment(deployment);
                return AjaxResult.error("创建失败");
            }
        }
        // 写入数据库
        String deploymentName = deployment.getMetadata().getName();
        String serviceName = service==null?null:service.getMetadata().getName();
        K8sUserAndDeployRelation k8sUserAndDeployRelation = new K8sUserAndDeployRelation();
        k8sUserAndDeployRelation.setLabId(labId);
        k8sUserAndDeployRelation.setUserId(studentId);
        k8sUserAndDeployRelation.setTeacherId(teacherId);
        k8sUserAndDeployRelation.setDeploymentName(deploymentName);
        k8sUserAndDeployRelation.setServiceName(serviceName);
        k8sUserAndDeployRelation.setDeployNamespace(K8sConstants.K8S_NAMESPACE);
        k8sUserAndDeployRelation.setCreateBy(studentName);
        k8sUserAndDeployRelation.setUpdateBy(studentName);
        k8sUserAndDeployRelation.setK8sConfigure(k8sConfigure);
        k8sMapper.insertK8sUserAndDeployRelation(k8sUserAndDeployRelation);
        return AjaxResult.success(k8sUserAndDeployRelation);
    }

    @Override
    public AjaxResult getK8sConfigureByLabId(String labId) {
        // 读取配置文件
        String k8sConfigureJsonString = k8sMapper.selectK8sConfigureByLabId(labId);
        // 将json字符串转换为k8sConfigure
        K8sConfigure k8sConfigure = new Gson().fromJson(k8sConfigureJsonString,K8sConfigure.class);
        return AjaxResult.success(k8sConfigure);
    }

    @Override
    public AjaxResult updateK8sConfigureByLabId(K8sConfigureVo k8sConfigureVo) {
        K8sConfigure k8sConfigure;
        // 使用Gson通过序列化的方式将k8sConfigureVo转换为k8sConfigure
        k8sConfigure= new Gson().fromJson(new Gson().toJson(k8sConfigureVo),K8sConfigure.class);
        // 将k8sConfigure转成json字符串
        String configure = new Gson().toJson(k8sConfigure);
        if (k8sMapper.updateK8sConfigureByLabId(k8sConfigureVo.getLabId(),configure) > 0){
            return AjaxResult.success("更新成功");
        }
        return AjaxResult.error();
    }

    public Deployment populateDeployment(K8sConfigure k8sConfigure, String labId, Long teacherId, Long studentId) throws IOException {
        // 修改imageName
        if("harbor".equals(k8sConfigure.getSourceFrom())){
            String imageName=k8sConfigure.getImageName();
            k8sConfigure.setImageName(harborUrl+"/"+harborSpace+"/"+imageName);
        }
        // 提前创建nfs目录
        String nfsPathNew = this.nfsPath + "/" + teacherId + "/" + labId+ "/" + studentId;
        if(!StringUtils.isEmpty(k8sConfigure.getVolume())){
            shellMan.exec("mkdir -p "+nfsPathNew);
        }

        K8sDeployment k8sDeployment = new K8sDeployment(k8sConfigure,labId,String.valueOf(teacherId),String.valueOf(studentId),nfsPathNew,nfsServer);
        return k8sDeployment.populate();
    }

    public io.fabric8.kubernetes.api.model.Service populateService(K8sConfigure k8sConfigure, String labId, Long teacherId, Long studentId) throws IOException {
        // 获取NodePorts
        List<Map<String,Integer>> ports=new ArrayList<>();
        for (Map<String, String> portMap : k8sConfigure.getPorts()) {
            Map<String,Integer> port=new HashMap<>();
            if ("http".equals(portMap.get("service"))||"ssh".equals(portMap.get("service"))||"other".equals(portMap.get("service"))){
                port.put("nodePort",k8sUtil.readNodePortCanUse());
            }
            port.put("port", Integer.valueOf(portMap.get("port")));
            port.put("targetPort", Integer.valueOf(portMap.get("targetPort")));
            ports.add(port);
        }
        // 创建service
        K8sService k8sService = new K8sService(k8sConfigure,labId,String.valueOf(teacherId),String.valueOf(studentId),ports);
        return k8sService.populate();
    }
}