package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_photo_album")
public class PhotoAlbumEntity {
    private int phoId;
    private String phoName;
    private String phoUploader;
    private String phoUrl;
    private String phoDate;
    private String phoDel;

    @Id
    @Column(name = "pho_id")
    public int getPhoId() {
        return phoId;
    }

    public void setPhoId(int phoId) {
        this.phoId = phoId;
    }

    @Basic
    @Column(name = "pho_name")
    public String getPhoName() {
        return phoName;
    }

    public void setPhoName(String phoName) {
        this.phoName = phoName;
    }

    @Basic
    @Column(name = "pho_uploader")
    public String getPhoUploader() {
        return phoUploader;
    }

    public void setPhoUploader(String phoUploader) {
        this.phoUploader = phoUploader;
    }

    @Basic
    @Column(name = "pho_url")
    public String getPhoUrl() {
        return phoUrl;
    }

    public void setPhoUrl(String phoUrl) {
        this.phoUrl = phoUrl;
    }

    @Basic
    @Column(name = "pho_date")
    public String getPhoDate() {
        return phoDate;
    }

    public void setPhoDate(String phoDate) {
        this.phoDate = phoDate;
    }

    @Basic
    @Column(name = "pho_del")
    public String getPhoDel() {
        return phoDel;
    }

    public void setPhoDel(String phoDel) {
        this.phoDel = phoDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbumEntity that = (PhotoAlbumEntity) o;

        if (phoId != that.phoId) return false;
        if (phoName != null ? !phoName.equals(that.phoName) : that.phoName != null) return false;
        if (phoUploader != null ? !phoUploader.equals(that.phoUploader) : that.phoUploader != null) return false;
        if (phoUrl != null ? !phoUrl.equals(that.phoUrl) : that.phoUrl != null) return false;
        if (phoDate != null ? !phoDate.equals(that.phoDate) : that.phoDate != null) return false;
        if (phoDel != null ? !phoDel.equals(that.phoDel) : that.phoDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phoId;
        result = 31 * result + (phoName != null ? phoName.hashCode() : 0);
        result = 31 * result + (phoUploader != null ? phoUploader.hashCode() : 0);
        result = 31 * result + (phoUrl != null ? phoUrl.hashCode() : 0);
        result = 31 * result + (phoDate != null ? phoDate.hashCode() : 0);
        result = 31 * result + (phoDel != null ? phoDel.hashCode() : 0);
        return result;
    }
}
