package com.codeonline.system.mapper;

import com.codeonline.system.domain.SysIdentity;
import com.codeonline.system.domain.SysSimpleDept;
import com.codeonline.system.domain.SysSimpleUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysIdentityMapper {
    /*
     * 查询出所有parent_id为100的部门
     * */
    public List<SysSimpleDept> selectColleges();

    /*
     * 查询出所有parent_id为deptId的部门'
     */
    public List<SysSimpleDept> selectClasses(@Param("deptId") int deptId);

    /*
    * 查询所有管理员名和id
    * */
    @Select("select user_id as userId, nick_name as nickName from sys_user where user_id in (select user_id from sys_user_role where role_id = 2)")
    public List<SysSimpleUser> selectAdmins();

    /*
    * 按照部门id查询角色为老师的用户
    * */
    @Select("select user_id as userId, nick_name as nickName from sys_user where user_id in (select user_id from sys_user_role where role_id = 3) and dept_id = #{deptId}")
    public List<SysSimpleUser> selectTeachers(@Param("deptId") int deptId);

    /*
    * 插入身份表
    * */
    public int addForms(SysIdentity sysIdentity);

    /*
    * 查询user_id是否在身份表中
    * */
    @Select("select count(*) from sys_my_identity where user_id = #{userId}")
    public int selectUserId(@Param("userId") Long userId);

}
