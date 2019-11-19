package com.wanxi.controller;

import com.wanxi.entiry.UserEntity;
import com.wanxi.service.UserService;
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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<UserEntity> findAllUser(){

        return service.findAllUser();
    }
}
