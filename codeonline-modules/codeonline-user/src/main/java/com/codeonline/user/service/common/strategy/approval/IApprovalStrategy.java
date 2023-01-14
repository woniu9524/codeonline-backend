package com.codeonline.user.service.common.strategy.approval;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.BusinessAffair;

public interface IApprovalStrategy {
    public AjaxResult approval(BusinessAffair businessAffair);
}
