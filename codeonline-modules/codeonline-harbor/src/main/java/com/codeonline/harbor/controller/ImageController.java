package com.codeonline.harbor.controller;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/7 6:53 星期六
 * @Description: 镜像管理类
 */
@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    // 检查镜像是否存在
    @GetMapping("/{imageName}")
    public AjaxResult checkImage(@PathVariable String imageName){
        return imageService.checkImage(imageName);
    }

}