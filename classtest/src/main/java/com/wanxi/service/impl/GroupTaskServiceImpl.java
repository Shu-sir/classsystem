package com.wanxi.service.impl;

import com.wanxi.entiry.GroupTaskEntity;
import com.wanxi.jpa.GroupTaskJPA;
import com.wanxi.service.GroupTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:27
 * @description：
 */
@Service
public class GroupTaskServiceImpl implements GroupTaskService {

    @Autowired
    private GroupTaskJPA groupTaskJPA;


    @Override
    public List<GroupTaskEntity> findAllGroupTask() {
        return groupTaskJPA.findAll();
    }
}
