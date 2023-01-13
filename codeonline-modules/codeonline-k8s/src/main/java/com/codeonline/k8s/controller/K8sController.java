package com.codeonline.k8s.controller;

import com.alibaba.nacos.shaded.com.google.gson.Gson;
import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.log.annotation.Log;
import com.codeonline.common.log.enums.BusinessType;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.k8s.model.K8sConfigure;
import com.codeonline.k8s.model.vo.K8sConfigureVo;
import com.codeonline.k8s.service.IK8sService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/k8s")
public class K8sController {

    @Autowired
    private IK8sService k8sService;

    @Log(title = "k8s控制",businessType = BusinessType.INSERT)
    @PostMapping("/configures")
    public AjaxResult createK8sConfigure(@RequestBody K8sConfigureVo k8sConfigureVo){
        // 设置用户id
        k8sConfigureVo.setUserId(SecurityUtils.getUserId());
        return k8sService.createK8sConfigure(k8sConfigureVo);
    }

    @Log(title = "k8s控制",businessType = BusinessType.INSERT)
    @PostMapping("/deployments/{labId}")
    public AjaxResult createK8sDeploy(@PathVariable("labId") String labId) throws IOException {
        return k8sService.createK8sDeploy(labId);
    }


    @Log(title = "k8s控制",businessType = BusinessType.INSERT)
    @GetMapping("/configures/lab/{labId}")
    public AjaxResult getK8sConfigureByLabId(@PathVariable String labId){
        return k8sService.getK8sConfigureByLabId(labId);
    }

    @Log(title = "k8s控制",businessType = BusinessType.INSERT)
    @PutMapping("/configures")
    public AjaxResult updateK8sConfigureByLabId(@RequestBody K8sConfigureVo k8sConfigureVo){
        return k8sService.updateK8sConfigureByLabId(k8sConfigureVo);
    }
}
