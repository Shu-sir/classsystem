package com.wanxi.service.impl;

import com.wanxi.entiry.CoursesEntity;
import com.wanxi.entiry.TeacherDutyEntity;
import com.wanxi.jpa.CoursesJPA;
import com.wanxi.jpa.TeacherDutyJPA;
import com.wanxi.service.CoursesService;
import com.wanxi.service.TeacherDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:51
 * @description：
 */
@Service
public class TeacherDutyServiceImpl implements TeacherDutyService {

    @Autowired
    private TeacherDutyJPA teacherDutyJPA;


    @Override
    public List<TeacherDutyEntity> findAllTeacherD() {
        return teacherDutyJPA.findAll();
    }
}
