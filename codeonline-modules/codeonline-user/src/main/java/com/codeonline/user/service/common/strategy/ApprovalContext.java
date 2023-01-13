package com.codeonline.user.service.common.strategy;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.BusinessAffair;
import com.codeonline.user.service.common.strategy.approval.IApprovalStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Administrator
 * @Date: 2023/1/5 6:19 星期四
 * @Description: 审批策略上下文，利用Spring的发现机制，将所有的策略注入到map中
 */
@Component
public class ApprovalContext {

    private final Map<String, IApprovalStrategy> approvalStrategyMap = new ConcurrentHashMap<>();

    public ApprovalContext(Map<String, IApprovalStrategy> approvalStrategyMap) {
        this.approvalStrategyMap.putAll(approvalStrategyMap);
    }

    public IApprovalStrategy getApprovalStrategy(String strategyName) {
        return approvalStrategyMap.get(strategyName);
    }

    public AjaxResult approval(String strategyName, BusinessAffair businessAffair) {
        if (approvalStrategyMap.get(strategyName) == null) {
            return approvalStrategyMap.get("普通审批").approval(businessAffair);
        }
        return approvalStrategyMap.get(strategyName).approval(businessAffair);
    }


}