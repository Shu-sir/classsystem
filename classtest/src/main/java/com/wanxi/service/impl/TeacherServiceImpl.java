package com.wanxi.service.impl;

import com.wanxi.entiry.TeacherEntity;
import com.wanxi.jpa.TeacherJPA;
import com.wanxi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:51
 * @description：
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherJPA teacherJPA;


    @Override
    public List<TeacherEntity> findAllTeacher() {
        return teacherJPA.findAll();
    }
}
