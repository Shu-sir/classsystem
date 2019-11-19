package com.wanxi.service.impl;

import com.wanxi.entiry.StudentEntity;
import com.wanxi.jpa.StudentJPA;
import com.wanxi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:14
 * @description：
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentJPA studentJPA;

    @Override
    public List<StudentEntity> getAllUser() {

        return studentJPA.findAll();
    }
}
