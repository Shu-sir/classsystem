package com.wanxi.controller;

import com.wanxi.entiry.CoursesEntity;
import com.wanxi.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 在远程仓库修改的数据
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:54
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "courses")
public class CourcesController {

    @Autowired
    private CoursesService coursesService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<CoursesEntity> getAllCourses(){
        List<CoursesEntity> cources = coursesService.findAllCource();
        return cources;
    }
}
