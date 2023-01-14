package com.codeonline.user.controller.student;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.user.service.student.ICourseServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/14 10:52 星期六
 * @Description:
 */
@RestController
@RequestMapping("/student/courses")
public class CourseControllerStudent {

    @Autowired
    private ICourseServiceStudent courseServiceStudent;

    @GetMapping()
    public AjaxResult selectCoursesByStudentId(){
        Long studentId = SecurityUtils.getUserId();
        return courseServiceStudent.queryCoursesByStudentId(studentId);
    }

}