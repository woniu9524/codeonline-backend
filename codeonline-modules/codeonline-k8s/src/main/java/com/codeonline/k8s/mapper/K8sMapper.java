package com.codeonline.k8s.mapper;

import com.codeonline.k8s.model.K8sConfigureJson;
import com.codeonline.k8s.model.K8sConfigureRelation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/8 3:12 星期日
 * @Description:
 */
@Mapper
public interface K8sMapper {
    /*
    *  插入k8s配置
    * */
    int insertK8sConfigure(K8sConfigureJson k8sConfigureJson);

    /*
    *  查询k8s配置是否存在
    * */
    @Select("select id from k8s_configure where configure=#{configure}")
    Long selectK8sConfigure(K8sConfigureJson k8sConfigureJson);

    /*
    * 插入k8s配置关系
    * */
    @Insert("insert into k8s_configure_relation(configure_id,lab_id,user_id,has_public) values(#{configureId},#{labId},#{userId},#{hasPublic})")
    int insertK8sConfigureRelation(K8sConfigureRelation k8sConfigureRelation);

    /*
    * 根据labId查询k8s配置
    * */
    @Select("select configure from k8s_configure where id in (select configure_id from k8s_configure_relation where lab_id=#{labId})")
    String selectK8sConfigureByLabId(@Param("labId") String labId);

    /*
    * 根据labId查询userId
     */
    @Select("select user_id from k8s_configure_relation where lab_id=#{labId}")
    Long selectUserIdByLabId(@Param("labId") String labId);
}
