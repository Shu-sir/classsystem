package com.wanxi.jpa;

import com.wanxi.entiry.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface CoursesJPA extends
        JpaRepository<CoursesEntity,Long>,
        JpaSpecificationExecutor<CoursesEntity>,
        Serializable {

}
