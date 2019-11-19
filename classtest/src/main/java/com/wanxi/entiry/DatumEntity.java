package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_datum")
public class DatumEntity {
    private int dataId;
    private String dataName;
    private String dataUploader;
    private String dataDate;
    private Integer dataDownload;
    private String dataUrl;
    private String dataDel;

    @Id
    @Column(name = "data_id")
    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    @Basic
    @Column(name = "data_name")
    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    @Basic
    @Column(name = "data_uploader")
    public String getDataUploader() {
        return dataUploader;
    }

    public void setDataUploader(String dataUploader) {
        this.dataUploader = dataUploader;
    }

    @Basic
    @Column(name = "data_date")
    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    @Basic
    @Column(name = "data_download")
    public Integer getDataDownload() {
        return dataDownload;
    }

    public void setDataDownload(Integer dataDownload) {
        this.dataDownload = dataDownload;
    }

    @Basic
    @Column(name = "data_url")
    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    @Basic
    @Column(name = "data_del")
    public String getDataDel() {
        return dataDel;
    }

    public void setDataDel(String dataDel) {
        this.dataDel = dataDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatumEntity that = (DatumEntity) o;

        if (dataId != that.dataId) return false;
        if (dataName != null ? !dataName.equals(that.dataName) : that.dataName != null) return false;
        if (dataUploader != null ? !dataUploader.equals(that.dataUploader) : that.dataUploader != null) return false;
        if (dataDate != null ? !dataDate.equals(that.dataDate) : that.dataDate != null) return false;
        if (dataDownload != null ? !dataDownload.equals(that.dataDownload) : that.dataDownload != null) return false;
        if (dataUrl != null ? !dataUrl.equals(that.dataUrl) : that.dataUrl != null) return false;
        if (dataDel != null ? !dataDel.equals(that.dataDel) : that.dataDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataId;
        result = 31 * result + (dataName != null ? dataName.hashCode() : 0);
        result = 31 * result + (dataUploader != null ? dataUploader.hashCode() : 0);
        result = 31 * result + (dataDate != null ? dataDate.hashCode() : 0);
        result = 31 * result + (dataDownload != null ? dataDownload.hashCode() : 0);
        result = 31 * result + (dataUrl != null ? dataUrl.hashCode() : 0);
        result = 31 * result + (dataDel != null ? dataDel.hashCode() : 0);
        return result;
    }
}
