package com.wanxi.jpa;

import com.wanxi.entiry.CourseWorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface CourseWorkJPA extends
        JpaRepository<CourseWorkEntity,Long>,
        JpaSpecificationExecutor<CourseWorkEntity>,
        Serializable {
}
