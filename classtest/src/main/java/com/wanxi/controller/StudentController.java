package com.wanxi.controller;

import com.wanxi.entiry.StudentEntity;
import com.wanxi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:17
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 获取所有学生信息
     * @return
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<StudentEntity> getAllStudent(){
        List<StudentEntity> allUser = studentService.getAllUser();
        return allUser;
    }
}
