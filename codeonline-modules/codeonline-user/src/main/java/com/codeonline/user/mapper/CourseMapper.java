package com.codeonline.user.mapper;

import com.codeonline.user.domain.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/11 4:39 星期三
 * @Description:
 */
@Mapper
public interface CourseMapper {
    // 查询课程信息
    @Select("select * from business_course")
    List<Course> queryCourseAllInfo();
    // 按照课程id查询课程信息
    @Select("select * from business_course where id = #{courseId}")
    Course queryCourseByCourseId(Long courseId);
    // 查询当前教师的所有课程
    @Select("select * from business_course where teacher_id = #{teacherId}")
    List<Course> queryCourseByTeacherId(Long teacherId);
    // 按照课程名称查询课程
    @Select("select * from business_course where course_name = #{courseName}")
    List<Course> queryCourseByCourseName(String courseName);
    // 添加课程
    @Insert("insert into business_course(teacher_id,teacher_name,course_name,course_status,introduction,course_start_time,course_end_time,course_week,create_time,create_by,update_time,update_by) values(#{teacherId},#{teacherName},#{courseName},#{courseStatus},#{introduction},#{courseStartTime},#{courseEndTime},#{courseWeek},sysdate(),#{createBy},sysdate(),#{updateBy})")
    int addCourse(Course course);
    // 修改课程信息
    int updateCourse(Course course);

    // 删除课程
    @Delete("delete from business_course where id = #{courseId}")
    int deleteCourse(@Param("courseId") Long courseId);

    // 批量删除课程
    @Delete("delete from business_course where id in (#{courseIds})")
    int deleteCourses(@Param("courseIds") String courseIds);


}
