package com.wanxi.controller;

import com.wanxi.entiry.StudentDutyEntity;
import com.wanxi.service.StudentDutyService;
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
@RequestMapping(value = "/studentDuty")
public class StudentDutyController {

    @Autowired
    private StudentDutyService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<StudentDutyEntity> findAllStudentD(){

        return service.findAllStudentDuty();
    }
}
