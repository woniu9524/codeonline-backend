package com.codeonline.user.mapper;

import com.codeonline.user.domain.BusinessAffair;
import com.codeonline.user.domain.SysIdentity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BusinessAffairMapper {
    /*
     * 根据affair_people_id查询business_affair表中的记录
     * */
    @Select("select * from business_affair where affair_people_id = #{affairPeopleId} and affair_type='身份绑定'")
    public List<BusinessAffair> selectAffairByAffairPeopleIdAndType(@Param("affairPeopleId") Long affairPeopleId);

    /*
     * 根据handle_people_id查询business_affair表中的记录
     * */
    @Select("select * from business_affair where handle_people_id = #{handlePeopleId}")
    public List<BusinessAffair> selectAffairByHandlePeopleId(@Param("handlePeopleId") Long handlePeopleId);

    /*
    * 根据affair_id来修改business_affair表中的记录
    *
    * */
    @Update("update business_affair set affair_status = #{affairStatus}, reply=#{reply},update_by=#{updateBy},update_time=sysdate() where affair_id = #{affairId} and handle_people_id = #{handlePeopleId}")
    public int updateAffairByAffairId(BusinessAffair businessAffair);

    /*
    *  修改sys_my_identity表中的update和has_finished记录
    * */
    @Update("update sys_my_identity set update_by = #{updateBy}, update_time = sysdate(), has_finished = #{hasFinished} where id = #{id}")
    public int updateIdentityByUserId(@Param("updateBy") String updateBy, @Param("hasFinished") int hasFinished, @Param("id") Long id);

    /*
    *  根据access_id 查询sys_my_identity表中的identity_id记录
    * */
    @Select("select * from sys_my_identity where id = #{accessId}")
    public SysIdentity selectIdentityIdByAccessId(@Param("accessId") Long accessId);

    /*
    * 在sys_user_role表中根据user_id更新role_id
    * */
    @Update("update sys_user_role set role_id = #{roleId} where user_id = #{userId}")
    public int updateUserRoleByUserId( @Param("userId") Long userId,@Param("roleId") Long roleId);

    /*
    * 在sys_user表中根据user_id更新dept_id
    * */
    @Update("update sys_user set dept_id = #{deptId} where user_id = #{userId}")
    public int updateUserDeptByUserId( @Param("userId") Long userId,@Param("deptId") Long deptId);
}
