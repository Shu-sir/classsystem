package com.wanxi.service.impl;

import com.wanxi.entiry.DatumEntity;
import com.wanxi.jpa.DatumJPA;
import com.wanxi.service.DdatumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:51
 * @description：
 */
@Service
public class DatumServiceImpl implements DdatumService {

    @Autowired
    private DatumJPA datumJPA;

    @Override
    public List<DatumEntity> findAllDatum() {
        return datumJPA.findAll();
    }

}
