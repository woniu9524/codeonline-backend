package com.codeonline.user.service.common;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.BusinessAffair;

public interface IAffairViewService {
    public AjaxResult selectIdentitiesAffairs(Long userId);
    public AjaxResult selectAffairs(Long userId);

    public AjaxResult approvalAffairs(BusinessAffair businessAffair);
}
