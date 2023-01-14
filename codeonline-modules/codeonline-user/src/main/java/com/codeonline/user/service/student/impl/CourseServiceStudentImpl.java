package com.codeonline.user.service.student.impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.mapper.CourseMapper;
import com.codeonline.user.service.student.ICourseServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/14 10:53 星期六
 * @Description:
 */
@Service
public class CourseServiceStudentImpl implements ICourseServiceStudent {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public AjaxResult queryCoursesByStudentId(Long studentId) {
        return AjaxResult.success(courseMapper.queryCourseByStudentId(studentId));
    }
}