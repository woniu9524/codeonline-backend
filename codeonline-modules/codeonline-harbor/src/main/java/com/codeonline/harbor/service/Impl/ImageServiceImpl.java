package com.codeonline.harbor.service.Impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.api.RepositoryApi;
import com.codeonline.harbor.api.model.Repository;
import com.codeonline.harbor.mapper.ImageMapper;
import com.codeonline.harbor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/7 7:12 星期六
 * @Description:
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Autowired
    private RepositoryApi repositoryApi;

    @Override
    public AjaxResult checkImage(String imageName) {
        String[] split = imageName.split(":");

        if(split.length != 2) {
            return AjaxResult.error("镜像名称格式错误");
        }

        String name = split[0];
        String tag = split[1];

        Repository repository = repositoryApi.getRepository(name);
        if (repository == null) {
            return AjaxResult.error("镜像不存在");
        }
        List<String> repositoryTags = repositoryApi.getRepositoryTags(name);
        if(repositoryTags.stream().anyMatch(tag::equals)){
            return AjaxResult.success("镜像存在");
        }
        return AjaxResult.error("镜像标签不存在");
    }
}