package com.wanxi.service.impl;

import com.wanxi.entiry.ProductionEntity;
import com.wanxi.jpa.ProductionJPA;
import com.wanxi.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:52
 * @description：
 */
@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    private ProductionJPA productionJPA;

    @Override
    public List<ProductionEntity> findAllProduction() {
        return productionJPA.findAll();
    }
}
