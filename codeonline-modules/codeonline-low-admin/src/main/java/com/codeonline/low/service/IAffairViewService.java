package com.codeonline.low.service;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.low.domain.BusinessAffair;

public interface IAffairViewService {
    public AjaxResult selectIdentitiesAffairs(Long userId);
    public AjaxResult selectAffairs(Long userId);

    public AjaxResult approvalAffairs(BusinessAffair businessAffair);
}
