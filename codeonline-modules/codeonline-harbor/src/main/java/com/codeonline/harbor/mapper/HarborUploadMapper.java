package com.codeonline.harbor.mapper;

import com.codeonline.harbor.model.HarborUpload;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HarborUploadMapper {

    public int insertHarborUpload(HarborUpload harborUpload);
}
