package com.codeonline.user.service.student;

import com.codeonline.common.core.web.domain.AjaxResult;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/14 10:53 星期六
 * @Description:
 */
public interface ICourseServiceStudent {
    AjaxResult queryCoursesByStudentId(Long studentId);
}
