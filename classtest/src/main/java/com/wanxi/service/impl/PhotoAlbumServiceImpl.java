package com.wanxi.service.impl;

import com.wanxi.entiry.PhotoAlbumEntity;
import com.wanxi.jpa.PhotoAlbumJPA;
import com.wanxi.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:43
 * @description：
 */
@Service
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

    @Autowired
    private PhotoAlbumJPA photoAlbumJPA;

    @Override
    public List<PhotoAlbumEntity> findAllPhotoAlbum() {
        return photoAlbumJPA.findAll();
    }
}
