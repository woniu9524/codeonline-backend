package com.codeonline.user.service.common.strategy.approval.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.BusinessAffair;
import com.codeonline.user.domain.SysIdentity;
import com.codeonline.user.mapper.BusinessAffairMapper;
import com.codeonline.user.service.common.strategy.approval.IApprovalStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Administrator
 * @Date: 2023/1/5 6:16 星期四
 * @Description: 身份认证审批策略
 */
@Component("身份绑定")
public class IdentityApprovalStrategyImpl implements IApprovalStrategy {

    @Autowired
    private BusinessAffairMapper businessAffairMapper;

    @Override
    public AjaxResult approval(BusinessAffair businessAffair) {
        // 1.更新身份事务表
        int flag=businessAffairMapper.updateIdentityByUserId(businessAffair.getUpdateBy(),1,businessAffair.getAccessId());
        if(flag>0){
            SysIdentity sysIdentity =businessAffairMapper.selectIdentityIdByAccessId(businessAffair.getAccessId());
            flag=businessAffairMapper.updateUserRoleByUserId(sysIdentity.getUserId(), sysIdentity.getIdentityId());
            if(flag>0){
                Long deptId=sysIdentity.getClassId()==null?sysIdentity.getCollegeId():sysIdentity.getClassId();
                flag=businessAffairMapper.updateUserDeptByUserId(sysIdentity.getUserId(), deptId);
                if (flag>0){
                    return AjaxResult.success("身份认证审批成功");
                }
            }
        }
        return AjaxResult.error("身份认证审批失败");
    }
}
