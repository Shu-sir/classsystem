package com.wanxi.jpa;

import com.wanxi.entiry.ProductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface ProductionJPA extends
        JpaRepository<ProductionEntity,Long>,
        JpaSpecificationExecutor<ProductionEntity>,
        Serializable {

}
