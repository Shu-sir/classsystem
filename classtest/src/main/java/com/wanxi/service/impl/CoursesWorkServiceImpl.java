package com.wanxi.service.impl;

import com.wanxi.entiry.CourseWorkEntity;
import com.wanxi.jpa.CourseWorkJPA;
import com.wanxi.service.CoursesWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 12:09
 * @description：
 */
@Service
public class CoursesWorkServiceImpl implements CoursesWorkService {
    @Autowired
    private CourseWorkJPA courseWorkJPA;

    @Override
    public List<CourseWorkEntity> findAllCoursesW() {
        return courseWorkJPA.findAll();
    }
}
