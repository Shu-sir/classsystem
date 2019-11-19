package com.wanxi.controller;

import com.wanxi.entiry.PhotoAlbumEntity;
import com.wanxi.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 14:44
 * @description：
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/photoAlbum")
public class PhotoAlbumController {

    @Autowired
    private PhotoAlbumService photoAlbumService;

    @RequestMapping(value = "all",method = RequestMethod.GET)
    public List<PhotoAlbumEntity> findAllPhotoAlbum(){
        return photoAlbumService.findAllPhotoAlbum();
    }
}
