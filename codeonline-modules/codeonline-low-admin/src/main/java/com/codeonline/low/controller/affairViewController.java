package com.codeonline.low.controller;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.low.domain.BusinessAffair;
import com.codeonline.low.service.IAffairViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/affairs")
public class affairViewController {

    @Autowired
    private IAffairViewService affairViewService;

    //查询身份绑定事务
    @GetMapping("/identities")
    public AjaxResult selectIdentitiesAffairs(){
        Long userid = SecurityUtils.getUserId();
        return affairViewService.selectIdentitiesAffairs(userid);
    }

    // 查询当前用户可以查询的事务
    @GetMapping()
    public AjaxResult selectAffairs(){
        Long userid = SecurityUtils.getUserId();
        return affairViewService.selectAffairs(userid);
    }

    // 审批事务
    @PutMapping ("/approval")
    public AjaxResult approvalAffairs(@RequestBody BusinessAffair businessAffair){
        Long userid = SecurityUtils.getUserId();
        String username = SecurityUtils.getUsername();
        businessAffair.setUpdateBy(username);
        businessAffair.setHandlePeopleId(userid);
        return affairViewService.approvalAffairs(businessAffair);
    }

}
