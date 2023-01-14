package com.codeonline.harbor.service.Impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.harbor.api.RepositoryApi;
import com.codeonline.harbor.api.model.Repository;
import com.codeonline.harbor.mapper.MarketMapper;
import com.codeonline.harbor.model.HarborUpload;
import com.codeonline.harbor.model.vo.MarketVo;
import com.codeonline.harbor.service.IMarketService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023/1/6 6:12 星期五
 * @Description: 应用市场Service实现类
 */
@Service
public class MarketServiceImpl implements IMarketService {

    @Autowired
    private MarketMapper marketMapper;

    @Autowired
    private RepositoryApi repositoryApi;

    @Value("${harbor.harborUrl}")
    private String harborUrl;
    @Value("${harbor.harborName}")
    private String harborName;
    @Value("${harbor.harborPassword}")
    private String harborPassword;
    @Value("${harbor.harborSpace}")
    private String harborSpace;


    @Override
    public AjaxResult getAllMarketImages() {
        List<HarborUpload> harborUploads = marketMapper.getAllMarketImages();
        List<Repository> repositories = repositoryApi.listRepository();
        List<MarketVo> marketVos = new ArrayList<>();
        for (HarborUpload harborUpload : harborUploads) {
            MarketVo marketVo = new MarketVo();
            BeanUtils.copyProperties(harborUpload, marketVo);

            for (Repository repository : repositories) {
                String[] split =repository.getName().split("/");

                if (split[1]!=null&&split[1].equals(harborUpload.getImageName())) {
                    marketVo.setPullCount(repository.getPullCount());
                    marketVo.setArtifactCount(repository.getArtifactCount());
                }
            }
            marketVos.add(marketVo);
        }
        return AjaxResult.success(marketVos);
    }
}


