package com.codeonline.user.controller.teacher;

import com.codeonline.common.core.web.domain.AjaxResult;
import com.codeonline.user.domain.Lab;
import com.codeonline.user.service.teacher.ILabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/12 3:36 星期四
 * @Description: 实验Controller
 */
@RestController
@RequestMapping("/teacher/labs")
public class LabController {
    @Autowired
    private ILabService labService;

    // 添加实验
    @PostMapping()
    public AjaxResult addLab(@RequestBody Lab lab) {
        return labService.addLab(lab);
    }

    // 修改实验
    @PutMapping()
    public AjaxResult updateLab(@RequestBody Lab lab) {
        return labService.updateLab(lab);
    }

    // 删除实验
    @DeleteMapping("/{labId}")
    public AjaxResult deleteLab(@PathVariable String labId) {
        return labService.deleteLab(labId);
    }

    // 通过courseId查询实验
    @GetMapping("/{courseId}")
    public AjaxResult queryLabByCourseId(@PathVariable Long courseId) {
        return labService.queryLabByCourseId(courseId);
    }

    // 通过labId查询实验
    @GetMapping("/lab/{labId}")
    public AjaxResult queryLabByLabId(@PathVariable String labId) {
        return labService.queryLabByLabId(labId);
    }




}