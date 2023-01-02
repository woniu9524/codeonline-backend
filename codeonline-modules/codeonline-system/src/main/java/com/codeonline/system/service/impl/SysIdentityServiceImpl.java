package com.codeonline.system.service.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.system.domain.SysIdentity;
import com.codeonline.system.domain.SysSimpleDept;
import com.codeonline.system.domain.SysSimpleUser;
import com.codeonline.system.mapper.SysIdentityMapper;
import com.codeonline.system.service.ISysIdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysIdentityServiceImpl implements ISysIdentityService {

    @Autowired
    private SysIdentityMapper sysIdentityMapper;

    @Override
    public AjaxResult selectColleges() {
        List<SysSimpleDept> sysSimpleDepts = sysIdentityMapper.selectColleges();
        return AjaxResult.success(sysSimpleDepts);
    }

    @Override
    public AjaxResult selectClasses(int deptId) {
        List<SysSimpleDept> sysSimpleDepts = sysIdentityMapper.selectClasses(deptId);
        return AjaxResult.success(sysSimpleDepts);
    }

    @Override
    public AjaxResult selectAdmins() {
        return AjaxResult.success(sysIdentityMapper.selectAdmins());
    }

    @Override
    public AjaxResult selectTeachers(int deptId) {
        return AjaxResult.success(sysIdentityMapper.selectTeachers(deptId));
    }

    @Override
    public AjaxResult addForms(SysIdentity sysIdentity) {
        int i = sysIdentityMapper.addForms(sysIdentity);
        if (i == 1) {
            return AjaxResult.success("添加成功,请等待管理员审核");
        } else {
            return AjaxResult.error("添加失败,请联系管理员");
        }
    }
}
