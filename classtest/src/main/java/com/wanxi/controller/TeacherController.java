package com.wanxi.controller;

import com.wanxi.entiry.TeacherDutyEntity;
import com.wanxi.entiry.TeacherEntity;
import com.wanxi.service.TeacherDutyService;
import com.wanxi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 15:04
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<TeacherEntity> findAllTeacher(){

        return service.findAllTeacher();
    }
}
