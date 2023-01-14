package com.codeonline.user.service.teacher;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.Lab;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/12 3:37 星期四
 * @Description:
 */
public interface ILabService {
    // 添加实验
    AjaxResult addLab(Lab lab);

    // 修改实验
    AjaxResult updateLab(Lab lab);

    // 删除实验
    AjaxResult deleteLab(String labId);

    // 通过courseId查询实验
    AjaxResult queryLabByCourseId(Long courseId);

    // 通过labId查询实验
    AjaxResult queryLabByLabId(String labId);
}
