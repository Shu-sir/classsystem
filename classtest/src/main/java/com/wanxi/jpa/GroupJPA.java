package com.wanxi.jpa;

import com.wanxi.entiry.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface GroupJPA extends
        JpaRepository<GroupEntity,Long>,
        JpaSpecificationExecutor<GroupEntity>,
        Serializable {

}
