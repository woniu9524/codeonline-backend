package com.codeonline.controller;

import com.codeonline.common.core.domain.R;
import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.log.enums.BusinessType;
import com.codeonline.service.IUploadService;
import com.codeonline.system.api.RemoteFileService;

import com.codeonline.common.log.annotation.Log;
import com.codeonline.system.api.domain.SysFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/harbor")
public class UploadController {

    @Autowired
    private RemoteFileService remoteFileService;

    @Autowired
    private IUploadService uploadService;

    //上传dockerfile
    @Log(title = "harbor上传", businessType = BusinessType.INSERT)
    @PostMapping("/dockerfile")
    public AjaxResult insertDockerfile(@RequestBody MultipartFile dockerfile) {
        //上传文件
        R<SysFile> result = remoteFileService.upload(dockerfile);
        if (result.getCode() == 200) {
            //上传成功
            String url = result.getData().getUrl();
            if(url.endsWith(".")){
                url=url.substring(0,url.length()-1);
            }
            // TODO 名字要傳進來
            String dockerfileName = "base-centos:1.0.0";
            return uploadService.dockerfileToImageAndPush(url, dockerfileName);
        } else {
            //上传失败
            return AjaxResult.error(result.getMsg());
        }
    }

    //上传镜像
    @Log(title = "harbor上传", businessType = BusinessType.INSERT)
    @PostMapping("/image")
    public AjaxResult addImage(@RequestBody MultipartFile image) {
        //上传文件
        R<SysFile> result = remoteFileService.upload(image);
        if (result.getCode() == 200) {
            //上传成功
            String url = result.getData().getUrl();
            String imageName = result.getData().getName();
            return uploadService.loadImageAndPush(url, imageName);
        } else {
            //上传失败
            return AjaxResult.error(result.getMsg());
        }
    }

}
