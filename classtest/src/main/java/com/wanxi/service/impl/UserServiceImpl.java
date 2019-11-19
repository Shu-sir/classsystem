package com.wanxi.service.impl;

import com.wanxi.entiry.TeacherEntity;
import com.wanxi.entiry.UserEntity;
import com.wanxi.jpa.TeacherJPA;
import com.wanxi.jpa.UserJPA;
import com.wanxi.service.TeacherService;
import com.wanxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:51
 * @description：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJPA userJPA;


    @Override
    public List<UserEntity> findAllUser() {
        return userJPA.findAll();
    }
}
