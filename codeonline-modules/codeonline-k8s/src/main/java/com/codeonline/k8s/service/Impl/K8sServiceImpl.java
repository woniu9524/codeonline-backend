package com.codeonline.k8s.service.Impl;

import com.alibaba.nacos.shaded.com.google.gson.Gson;
import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.k8s.mapper.K8sMapper;
import com.codeonline.k8s.model.K8sConfigure;
import com.codeonline.k8s.model.K8sConfigureJson;
import com.codeonline.k8s.model.K8sConfigureRelation;
import com.codeonline.k8s.model.vo.K8sConfigureVo;
import com.codeonline.k8s.service.IK8sService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/8 3:10 星期日
 * @Description:
 */
@Service
public class K8sServiceImpl implements IK8sService {

    @Autowired
    private K8sMapper k8sMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult createK8sConfigure(K8sConfigureVo k8sConfigureVo) {
        K8sConfigure k8sConfigure = new K8sConfigure();
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
    public AjaxResult createK8sDeploy(String labId) {
        // 读取配置文件
        String k8sConfigureJsonString = k8sMapper.selectK8sConfigureByLabId(labId);
        // 将json字符串转换为k8sConfigure
        K8sConfigure k8sConfigure = new Gson().fromJson(k8sConfigureJsonString,K8sConfigure.class);
        // 读取teacherId
        Long teacherId = k8sMapper.selectUserIdByLabId(labId);
        // 读取userId
        Long studentId = SecurityUtils.getUserId();
        // 创建k8s部署

        return null;
    }
}