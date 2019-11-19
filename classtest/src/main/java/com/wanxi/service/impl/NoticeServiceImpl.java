package com.wanxi.service.impl;

import com.wanxi.entiry.NoticeEntity;
import com.wanxi.jpa.NoticeJPA;
import com.wanxi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:36
 * @description：
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeJPA noticeJPA;

    @Override
    public List<NoticeEntity> findAllNotice() {
        return noticeJPA.findAll();
    }
}
