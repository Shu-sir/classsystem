package com.wanxi.controller;

import com.wanxi.entiry.DatumEntity;
import com.wanxi.service.DdatumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:54
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "datum")
public class DatumController {

    @Autowired
    private DdatumService service;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<DatumEntity> getAllDatum(){
        List<DatumEntity> cources = service.findAllDatum();
        return cources;
    }
}
