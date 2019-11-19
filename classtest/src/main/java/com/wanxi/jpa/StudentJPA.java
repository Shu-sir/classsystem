package com.wanxi.jpa;

import com.wanxi.entiry.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface StudentJPA extends
        JpaRepository<StudentEntity,Long>,
        JpaSpecificationExecutor<StudentEntity>,
        Serializable {

}
