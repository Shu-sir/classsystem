package com.wanxi.jpa;

import com.wanxi.entiry.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface NoticeJPA extends
        JpaRepository<NoticeEntity,Long>,
        JpaSpecificationExecutor<NoticeEntity>,
        Serializable {

}
