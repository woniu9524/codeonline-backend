package com.codeonline.harbor.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/*
* 上传harbor镜像表单的vo
* 包括 prefix environmentName tag uuid,并添加不为空的约束
* */
@Data
public class HarborUploadVo {

    private String environmentName;

    private String tag;


    private boolean isDockerfile;

    @NotBlank(message = "文件上传出问题了")
    private String uuid;

    private String url;//读取的路径
}
