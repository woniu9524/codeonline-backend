package com.codeonline.harbor.mapper;

import com.codeonline.harbor.model.HarborUpload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023/1/6 6:15 星期五
 * @Description: 应用市场mapper接口
 */
@Mapper
public interface MarketMapper {
    /*
    * 查询所有公开的镜像信息，按照创建时间倒序排列，按镜像名称分组，取每组的第一条
    * */
    @Select("select * from harbor_upload where is_public = 1 group by image_name order by create_time desc")
    List<HarborUpload> getAllMarketImages();
}
