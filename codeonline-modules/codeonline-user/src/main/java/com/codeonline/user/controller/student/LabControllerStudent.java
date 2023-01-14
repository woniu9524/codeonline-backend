package com.codeonline.user.controller.student;

import com.codeonline.user.service.student.ILabServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/15 1:04 星期日
 * @Description:
 */
@RestController
@RequestMapping("/student/labs")
public class LabControllerStudent {
    @Autowired
    private ILabServiceStudent labServiceStudent;

}