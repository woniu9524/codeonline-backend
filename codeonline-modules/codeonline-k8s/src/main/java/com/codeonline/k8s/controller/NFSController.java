package com.codeonline.k8s.controller;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.log.annotation.Log;
import com.codeonline.common.log.enums.BusinessType;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.k8s.model.vo.K8sConfigureVo;
import com.codeonline.k8s.service.INfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/nfs")
public class NFSController {

    @Autowired
    private INfsService nfsService;

    /*
    *  读取当前实验下的文件
    * */
    @GetMapping("/{labId}")
    public AjaxResult readNFSByUser(@PathVariable String labId){
        Long courseId= Long.valueOf(labId.split("-")[0]);
        Long userId=SecurityUtils.getUserId();
        return nfsService.selectLabFilesByLabId(courseId,labId,userId);
    }



}
