package com.wanxi.controller;

import com.wanxi.entiry.ProductionEntity;
import com.wanxi.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:54
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "production")
public class ProductionController {

    @Autowired
    private ProductionService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<ProductionEntity> findAllProduction(){
        return service.findAllProduction();
    }
}
