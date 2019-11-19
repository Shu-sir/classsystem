package com.wanxi.jpa;

import com.wanxi.entiry.StudentDutyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface StudentDutyJPA extends
        JpaRepository<StudentDutyEntity,Integer>,
        JpaSpecificationExecutor<StudentDutyEntity>,
        Serializable {

}
