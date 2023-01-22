package com.codeonline.k8s.service;

import com.codeonline.common.core.web.domain.AjaxResult;

public interface INfsService {
    AjaxResult selectLabFilesByLabId(Long courseId,String labId,Long userId);
}
