package com.wanxi.jpa;

import com.wanxi.entiry.GroupTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface GroupTaskJPA extends
        JpaRepository<GroupTaskEntity,Long>,
        JpaSpecificationExecutor<GroupTaskEntity>,
        Serializable {

}
