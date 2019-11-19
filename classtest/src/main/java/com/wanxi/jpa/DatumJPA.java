package com.wanxi.jpa;

import com.wanxi.entiry.DatumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface DatumJPA extends
        JpaRepository<DatumEntity,Long>,
        JpaSpecificationExecutor<DatumEntity>,
        Serializable {

}
