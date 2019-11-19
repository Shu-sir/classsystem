package com.wanxi.controller;

import com.wanxi.entiry.CoursesEntity;
import com.wanxi.entiry.NoticeEntity;
import com.wanxi.service.CoursesService;
import com.wanxi.service.NoticeService;
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
@RequestMapping(value = "notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<NoticeEntity> getAllNotice(){
        List<NoticeEntity> cources = noticeService.findAllNotice();
        return cources;
    }
}
