package com.wanxi.service.impl;

import com.wanxi.entiry.CoursesEntity;
import com.wanxi.jpa.CoursesJPA;
import com.wanxi.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:51
 * @description：
 */
@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesJPA coursesJPA;

    @Override
    public List<CoursesEntity> findAllCource() {
        return coursesJPA.findAll();
    }
}
