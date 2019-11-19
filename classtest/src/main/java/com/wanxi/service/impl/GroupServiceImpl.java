package com.wanxi.service.impl;

import com.wanxi.entiry.GroupEntity;
import com.wanxi.jpa.GroupJPA;
import com.wanxi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 12:56
 * @description：
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupJPA groupJPA;

    @Override
    public List<GroupEntity> findAllGroup() {
        return groupJPA.findAll();
    }
}
