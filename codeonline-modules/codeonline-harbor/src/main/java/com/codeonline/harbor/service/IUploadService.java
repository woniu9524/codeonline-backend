package com.codeonline.harbor.service;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.model.HarborUpload;

public interface IUploadService {
    void dockerfileToImageAndPush(HarborUpload harborUpload,String harborKey);

    void loadImageAndPush(HarborUpload harborUpload,String harborKey);

    void importImageAndPush(HarborUpload harborUpload,String harborKey);
}
