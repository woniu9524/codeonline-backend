package com.codeonline.user.service.student.impl;

import com.codeonline.user.mapper.LabMapper;
import com.codeonline.user.service.student.ILabServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangcheng
 * @Date: 2023/1/15 1:06 星期日
 * @Description:
 */
@Service
public class LabServiceStudentImpl implements ILabServiceStudent {
    @Autowired
    private LabMapper labMapper;


}

