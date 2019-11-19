package com.wanxi.controller;

import com.wanxi.entiry.CourseWorkEntity;
import com.wanxi.service.CoursesService;
import com.wanxi.service.CoursesWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 12:10
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "coursesWork")
public class CourcesWorkController {

    @Autowired
    private CoursesWorkService coursesWorkService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<CourseWorkEntity> getAllcoursesW(){
        List<CourseWorkEntity> allCW = coursesWorkService.findAllCoursesW();
        return allCW;
    }

}
