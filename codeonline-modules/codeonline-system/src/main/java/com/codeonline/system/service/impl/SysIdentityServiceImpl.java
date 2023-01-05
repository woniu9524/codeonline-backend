package com.codeonline.system.service.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.system.domain.BusinessAffair;
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
        int flag;
        BusinessAffair businessAffair = new BusinessAffair();
        // 判断是否已经存在
        List<SysIdentity> sysIdentities = sysIdentityMapper.selectUserId(sysIdentity.getUserId());

        if (sysIdentities.size() > 0) {
            // 判断是否已经完成
            if(sysIdentities.get(0).getHasFinished()){
                return AjaxResult.success("已经完成绑定，重新登录后生效");
            }
            // 更新数据
            flag = sysIdentityMapper.updateForms(sysIdentity);
            if (flag <= 0) {
                return AjaxResult.error("更新失败");
            }
            businessAffair.setAccessId(sysIdentities.get(0).getId());
        } else {
            // 插入数据
            flag = sysIdentityMapper.addForms(sysIdentity);
            if (flag <= 0) {
                return AjaxResult.error("插入失败");
            }
            sysIdentities = sysIdentityMapper.selectUserId(sysIdentity.getUserId());
            businessAffair.setAccessId(sysIdentities.get(0).getId());
        }

        businessAffair.setAffairType("身份绑定");
        businessAffair.setAffairStatus("待审核");
        businessAffair.setAffairPeopleName(sysIdentity.getCreateBy());
        businessAffair.setAffairPeopleId(sysIdentity.getUserId());
        businessAffair.setHandlePeopleId(sysIdentity.getApproverId());
        businessAffair.setRemark(sysIdentity.getRemark());
        businessAffair.setCreateBy(sysIdentity.getCreateBy());
        businessAffair.setUpdateBy(sysIdentity.getUpdateBy());

        if(sysIdentityMapper.selectAccessId(businessAffair.getAccessId())==0){
            if (sysIdentityMapper.addBusinessAffair(businessAffair) == 1) {
                return AjaxResult.success("添加成功,请等待管理员审核");
            } else {
                return AjaxResult.error("添加失败,请联系管理员");
            }
        }else {
            if(sysIdentityMapper.updateBusinessAffair(businessAffair)==1){
                return AjaxResult.success("添加成功,请等待管理员审核");
            }else {
                return AjaxResult.error("添加失败,请联系管理员");
            }
        }


    }


}
