package com.wanxi.jpa;

import com.wanxi.entiry.PhotoAlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface PhotoAlbumJPA extends
        JpaRepository<PhotoAlbumEntity,Long>,
        JpaSpecificationExecutor<PhotoAlbumEntity>,
        Serializable {
}
