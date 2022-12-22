package com.codeonline.service;

import com.codeonline.common.core.web.domain.AjaxResult;

public interface IUploadService {
    AjaxResult dockerfileToImageAndPush(String url, String dockerfileName);

    AjaxResult loadImageAndPush(String url,String imageName);
}
