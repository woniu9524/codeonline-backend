package com.codeonline.user.service.common.strategy.approval.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.BusinessAffair;
import com.codeonline.user.service.common.strategy.approval.IApprovalStrategy;
import org.springframework.stereotype.Component;

/**
 * @Author: Administrator
 * @Date: 2023/1/5 6:40 星期四
 * @Description: 普通审批策略
 */
@Component("普通审批")
public class CommonApprovalStrategyImpl implements IApprovalStrategy {
    @Override
    public AjaxResult approval(BusinessAffair businessAffair) {
        return AjaxResult.success("普通审批成功");
    }
}
