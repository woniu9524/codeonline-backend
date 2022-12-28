package com.codeonline.harbor.service;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.model.HarborUpload;

public interface IUploadService {
    AjaxResult dockerfileToImageAndPush(HarborUpload harborUpload);

    AjaxResult loadImageAndPush(HarborUpload harborUpload);
}
