package com.wanxi.jpa;

import com.wanxi.entiry.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface TeacherJPA extends
        JpaRepository<TeacherEntity,Long>,
        JpaSpecificationExecutor<TeacherEntity>,
        Serializable {

}
