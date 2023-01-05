package com.codeonline.system.service;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.system.domain.SysIdentity;
import com.codeonline.system.domain.SysSimpleDept;

import java.util.List;

public interface ISysIdentityService {
    public AjaxResult selectColleges();
    public AjaxResult selectClasses(int deptId);

    public AjaxResult selectAdmins();

    public AjaxResult selectTeachers(int deptId);

    public AjaxResult addForms(SysIdentity sysIdentity);


}
