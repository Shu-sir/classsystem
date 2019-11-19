package com.wanxi.service.impl;

import com.wanxi.entiry.StudentDutyEntity;
import com.wanxi.jpa.StudentDutyJPA;
import com.wanxi.service.StudentDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 15:02
 * @description：
 */
@Service
public class StudentDutyServiceImpl implements StudentDutyService {

    @Autowired
    private StudentDutyJPA studentDutyJPA;

    @Override
    public List<StudentDutyEntity> findAllStudentDuty() {
        return studentDutyJPA.findAll();
    }
}
