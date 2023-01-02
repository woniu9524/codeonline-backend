package com.codeonline.system.controller;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.system.domain.SysIdentity;
import com.codeonline.system.service.ISysIdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/identity")
public class SysIdentityController {

    @Autowired
    private ISysIdentityService identityService;

    @GetMapping("/colleges")
    public AjaxResult selectColleges() {
        return identityService.selectColleges();
    }

    @GetMapping("/classes")
    public AjaxResult selectClasses(@RequestParam int deptId) {
        return identityService.selectClasses(deptId);
    }

    @GetMapping("/admins")
    public AjaxResult selectAdmins() {
        return identityService.selectAdmins();
    }

    @GetMapping("/teachers")
    public AjaxResult selectTeachers(@RequestParam int deptId) {
        return identityService.selectTeachers(deptId);
    }

    @PostMapping("forms")
    public AjaxResult addForms(@RequestBody @Validated SysIdentity sysIdentity) {
        Long userid = SecurityUtils.getUserId();
        String username = SecurityUtils.getUsername();
        sysIdentity.setUserId(userid);
        sysIdentity.setCreateBy(username);
        sysIdentity.setUpdateBy(username);
        return identityService.addForms(sysIdentity);
    }
}
