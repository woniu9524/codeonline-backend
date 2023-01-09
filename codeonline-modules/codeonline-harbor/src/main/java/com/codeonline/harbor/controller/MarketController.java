package com.codeonline.harbor.controller;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.log.annotation.Log;
import com.codeonline.common.log.enums.BusinessType;
import com.codeonline.harbor.service.IMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Date: 2023/1/6 6:07 星期五
 * @Description: 镜像市场
 */
@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private IMarketService marketService;

    /*
    *  读取镜像市场的镜像
    * */
    @Log(title = "应用市场",businessType = BusinessType.INSERT)
    @GetMapping("/images")
    public AjaxResult getAllMarketImages(){
        return marketService.getAllMarketImages();
    }

}