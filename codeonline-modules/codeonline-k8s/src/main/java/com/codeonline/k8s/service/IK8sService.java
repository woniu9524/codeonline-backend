package com.codeonline.k8s.service;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.k8s.model.vo.K8sConfigureVo;

import java.io.IOException;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/8 3:09 星期日
 * @Description:
 */
public interface IK8sService {
    AjaxResult createK8sConfigure(K8sConfigureVo k8sConfigureVo);

    AjaxResult createK8sDeploy(String labId) throws IOException;

    // 根据labId获取k8s配置信息
    AjaxResult getK8sConfigureByLabId(String labId);

    // 根据labId更新k8s配置信息
    AjaxResult updateK8sConfigureByLabId(K8sConfigureVo k8sConfigureVo);
}
