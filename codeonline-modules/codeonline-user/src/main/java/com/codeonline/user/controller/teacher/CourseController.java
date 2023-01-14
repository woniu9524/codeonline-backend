package com.codeonline.user.controller.teacher;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.user.domain.Course;
import com.codeonline.user.service.teacher.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/11 4:38 星期三
 * @Description: 课程控制类
 */
@RestController
@RequestMapping("/teacher/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;


    // 查询课程信息
    @GetMapping("/{courseId}")
    public AjaxResult selectCourseById(@PathVariable Long courseId){
        return courseService.queryCourseByCourseId(courseId);
    }

    // 查询当前教师的所有课程
    @GetMapping()
    public AjaxResult selectCourseByTeacherId(){
        // TODO 如果是管理员返回全部课程
        Long teacherId = SecurityUtils.getUserId();
        return courseService.queryCourseByTeacherId(teacherId);
    }

    // 按照课程名称查询课程
    @GetMapping("/name/{courseName}")
    public AjaxResult selectCourseByCourseName(@PathVariable String courseName){
        return courseService.queryCourseByCourseName(courseName);
    }

    // 添加课程
    @PostMapping()
    public AjaxResult addCourse(@RequestBody Course course){
        String username = SecurityUtils.getUsername();
        Long userId = SecurityUtils.getUserId();
        course.setTeacherName(username);
        course.setTeacherId(userId);
        course.setCreateBy(username);
        course.setUpdateBy(username);
        return courseService.addCourse(course);
    }

    // 修改课程信息
    @PutMapping()
    public AjaxResult updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    // 删除课程
    @DeleteMapping("/{courseId}")
    public AjaxResult deleteCourse(@PathVariable Long courseId){
        return courseService.deleteCourse(courseId);
    }

    // 批量删除课程
    @DeleteMapping()
    public AjaxResult deleteCourses(@RequestBody List<String> courseIds){
        return courseService.deleteCourses(courseIds);
    }

    // 查询当前课程的所有学生
    @GetMapping("/students/{courseId}")
    public AjaxResult selectStudentsByCourseId(@PathVariable Long courseId){
        return courseService.queryStudentsByCourseId(courseId);
    }

    // 添加学生到课程
    @PostMapping("/students/{courseId}")
    public AjaxResult addStudentsToCourse(@PathVariable Long courseId, @RequestBody String userName){

        return courseService.addStudentToCourse(courseId, userName);
    }

    // 删除学生到课程
    @DeleteMapping("/students/{courseId}/{studentId}")
    public AjaxResult deleteStudentFromCourse(@PathVariable Long courseId, @PathVariable Long studentId){
        return courseService.deleteStudentToCourse(courseId, studentId);
    }




}