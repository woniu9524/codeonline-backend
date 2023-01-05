package com.codeonline.low.service.strategy.approval;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.low.domain.BusinessAffair;

public interface IApprovalStrategy {
    public AjaxResult approval(BusinessAffair businessAffair);
}
