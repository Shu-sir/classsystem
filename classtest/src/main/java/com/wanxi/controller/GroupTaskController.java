package com.wanxi.controller;

import com.wanxi.entiry.GroupTaskEntity;
import com.wanxi.service.GroupTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:31
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/groupTask")
public class GroupTaskController {

    @Autowired
    private GroupTaskService groupTaskService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<GroupTaskEntity> findAllGroupTask(){
        return groupTaskService.findAllGroupTask();
    }
}
