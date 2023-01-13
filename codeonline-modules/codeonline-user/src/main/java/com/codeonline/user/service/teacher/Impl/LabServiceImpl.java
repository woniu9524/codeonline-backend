package com.codeonline.user.service.teacher.Impl;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.Lab;
import com.codeonline.user.mapper.LabMapper;
import com.codeonline.user.service.teacher.ILabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/12 3:37 星期四
 * @Description:
 */
@Service
public class LabServiceImpl implements ILabService {
    @Autowired
    private LabMapper labMapper;


    @Override
    public AjaxResult addLab(Lab lab) {
        // 生成labId
        lab.setLabId(lab.getCourseId()+"-"+System.currentTimeMillis());
        int i = labMapper.addLab(lab);
        Map<String,String> map = new HashMap<>();
        map.put("labId",lab.getLabId());
        if (i > 0) {
            return AjaxResult.success(map);
        }
        return AjaxResult.error("添加失败");
    }

    @Override
    public AjaxResult updateLab(Lab lab) {
        int i = labMapper.updateLab(lab);
        if (i > 0) {
            return AjaxResult.success("修改成功");
        }
        return AjaxResult.error("修改失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public AjaxResult deleteLab(String labId) {
        labMapper.deleteK8sConfigureByLabId(labId);
        int i = labMapper.deleteLab(labId);
        if (i > 0) {
            return AjaxResult.success("删除成功");
        }
        return AjaxResult.error("删除失败");
    }

    @Override
    public AjaxResult queryLabByCourseId(Long courseId) {
        return AjaxResult.success(labMapper.queryLabByCourseId(courseId));
    }

    @Override
    public AjaxResult queryLabByLabId(String labId) {
        return AjaxResult.success(labMapper.queryLabByLabId(labId));
    }
}