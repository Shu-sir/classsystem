package com.wanxi.controller;

import com.wanxi.entiry.GroupEntity;
import com.wanxi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:54
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<GroupEntity> getAllGroup(){
        List<GroupEntity> cources = groupService.findAllGroup();
        return cources;
    }
}
