package com.codeonline.user.service.teacher;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.Course;

import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/11 4:38 星期三
 * @Description:
 */
public interface ICourseService {
    // 查询课程信息
    AjaxResult queryCourseAllInfo();
    // 按照课程id查询课程信息
    AjaxResult queryCourseByCourseId(Long CourseId);
    // 查询当前教师的所有课程
    AjaxResult queryCourseByTeacherId(Long teacherId);
    // 按照课程名称查询课程
    AjaxResult queryCourseByCourseName(String courseName);
    // 添加课程
    AjaxResult addCourse(Course course);
    // 修改课程信息
    AjaxResult updateCourse(Course course);
    // 删除课程
    AjaxResult deleteCourse(Long courseId);
    // 批量删除课程
    AjaxResult deleteCourses(List<String> courseIds);

}
