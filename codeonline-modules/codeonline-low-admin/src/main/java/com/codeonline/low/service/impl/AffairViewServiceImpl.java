package com.codeonline.low.service.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.low.domain.BusinessAffair;
import com.codeonline.low.mapper.BusinessAffairMapper;
import com.codeonline.low.service.IAffairViewService;
import com.codeonline.low.service.strategy.ApprovalContext;
import com.codeonline.low.service.strategy.approval.IApprovalStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AffairViewServiceImpl implements IAffairViewService {

    @Autowired
    private BusinessAffairMapper businessAffairMapper;

    @Autowired
    private ApprovalContext approvalContext;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult selectIdentitiesAffairs(Long userId) {
        List<BusinessAffair> businessAffairs = businessAffairMapper.selectAffairByAffairPeopleIdAndType(userId);
        if (businessAffairs.size() > 0) {
            return AjaxResult.success(businessAffairs.get(0));
        }
        return AjaxResult.error("没有绑定身份事务");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult selectAffairs(Long userId) {
        List<BusinessAffair> businessAffairs = businessAffairMapper.selectAffairByHandlePeopleId(userId);

        return AjaxResult.success(businessAffairs);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult approvalAffairs(BusinessAffair businessAffair) {
        int flag = businessAffairMapper.updateAffairByAffairId(businessAffair);
        if (flag > 0) {
            //调用策略模式,根据事务类型调用不同的策略,进行审批
            return approvalContext.approval(businessAffair.getAffairType(),businessAffair);
        }
        return AjaxResult.error("审批失败");
    }
}
