package com.codeonline.user.service.teacher.Impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.common.security.utils.SecurityUtils;
import com.codeonline.user.domain.Course;
import com.codeonline.user.mapper.CourseMapper;
import com.codeonline.user.service.teacher.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/11 4:39 星期三
 * @Description:
 */

@Service
public class CourseServiceImpl implements ICourseService {


    @Autowired
    private CourseMapper courseMapper;

    @Override
    public AjaxResult queryCourseAllInfo() {
        return AjaxResult.success(courseMapper.queryCourseAllInfo());
    }

    @Override
    public AjaxResult queryCourseByCourseId(Long CourseId) {
        return AjaxResult.success(courseMapper.queryCourseByCourseId(CourseId));
    }

    @Override
    public AjaxResult queryCourseByTeacherId(Long teacherId) {
        return AjaxResult.success(courseMapper.queryCourseByTeacherId(teacherId));
    }

    @Override
    public AjaxResult queryCourseByCourseName(String courseName) {
        return AjaxResult.success(courseMapper.queryCourseByCourseName(courseName));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult addCourse(Course course) {
        int i = courseMapper.addCourse(course);
        if (i > 0) {
            return AjaxResult.success("添加成功");
        }
        return AjaxResult.error("添加失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult updateCourse(Course course) {
        int i = courseMapper.updateCourse(course);
        if (i > 0) {
            return AjaxResult.success("修改成功");
        }
        return AjaxResult.error("修改失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult deleteCourse(Long courseId) {
        int i = courseMapper.deleteCourse(courseId);
        if (i > 0) {
            return AjaxResult.success("删除成功");
        }
        return AjaxResult.error("删除失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult deleteCourses(List<String> courseIds) {
        String ids = String.join(",", courseIds);
        int i = courseMapper.deleteCourses(ids);
        if (i > 0) {
            return AjaxResult.success("删除成功");
        }
        return AjaxResult.error("删除失败");

    }

    @Override
    public AjaxResult queryStudentsByCourseId(Long courseId) {
        return AjaxResult.success(courseMapper.queryStudentsByCourseId(courseId));
    }

    @Override
    public AjaxResult addStudentToCourse(Long courseId, String userName) {
        // 查询学生id
        Long studentId = courseMapper.queryUserIdByUserName(userName);
        if (studentId == null) {
            return AjaxResult.error("该学生不存在");
        }
        // 查询学生是否已经在课程中
        int i = courseMapper.queryStudentIsInCourse(studentId,courseId);
        if (i > 0) {
            return AjaxResult.error("该学生已经在课程中");
        }
        // 添加学生到课程中
        String createBy = SecurityUtils.getUsername();
        int j = courseMapper.addStudentToCourse(studentId,courseId,createBy,createBy);
        if (j > 0) {
            return AjaxResult.success("添加成功");
        }
        return AjaxResult.error("添加失败");
    }

    @Override
    public AjaxResult deleteStudentToCourse(Long courseId, Long studentId) {
        return courseMapper.deleteStudentFromCourse(studentId,courseId) > 0 ? AjaxResult.success("删除成功") : AjaxResult.error("删除失败");
    }


}