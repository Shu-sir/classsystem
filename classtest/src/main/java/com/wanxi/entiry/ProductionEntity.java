package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_production")
public class ProductionEntity {
    private int proId;
    private String proName;
    private String proDescription;
    private String proUrl;
    private String proDate;
    private int proTeacherId;
    private int proStudentId;
    private String proType;
    private String proDel;

    @Id
    @Column(name = "pro_id")
    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    @Basic
    @Column(name = "pro_name")
    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Basic
    @Column(name = "pro_description")
    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    @Basic
    @Column(name = "pro_url")
    public String getProUrl() {
        return proUrl;
    }

    public void setProUrl(String proUrl) {
        this.proUrl = proUrl;
    }

    @Basic
    @Column(name = "pro_date")
    public String getProDate() {
        return proDate;
    }

    public void setProDate(String proDate) {
        this.proDate = proDate;
    }

    @Basic
    @Column(name = "pro_teacher_id")
    public int getProTeacherId() {
        return proTeacherId;
    }

    public void setProTeacherId(int proTeacherId) {
        this.proTeacherId = proTeacherId;
    }

    @Basic
    @Column(name = "pro_student_id")
    public int getProStudentId() {
        return proStudentId;
    }

    public void setProStudentId(int proStudentId) {
        this.proStudentId = proStudentId;
    }

    @Basic
    @Column(name = "pro_type")
    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    @Basic
    @Column(name = "pro_del")
    public String getProDel() {
        return proDel;
    }

    public void setProDel(String proDel) {
        this.proDel = proDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductionEntity that = (ProductionEntity) o;

        if (proId != that.proId) return false;
        if (proTeacherId != that.proTeacherId) return false;
        if (proStudentId != that.proStudentId) return false;
        if (proName != null ? !proName.equals(that.proName) : that.proName != null) return false;
        if (proDescription != null ? !proDescription.equals(that.proDescription) : that.proDescription != null)
            return false;
        if (proUrl != null ? !proUrl.equals(that.proUrl) : that.proUrl != null) return false;
        if (proDate != null ? !proDate.equals(that.proDate) : that.proDate != null) return false;
        if (proType != null ? !proType.equals(that.proType) : that.proType != null) return false;
        if (proDel != null ? !proDel.equals(that.proDel) : that.proDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proId;
        result = 31 * result + (proName != null ? proName.hashCode() : 0);
        result = 31 * result + (proDescription != null ? proDescription.hashCode() : 0);
        result = 31 * result + (proUrl != null ? proUrl.hashCode() : 0);
        result = 31 * result + (proDate != null ? proDate.hashCode() : 0);
        result = 31 * result + proTeacherId;
        result = 31 * result + proStudentId;
        result = 31 * result + (proType != null ? proType.hashCode() : 0);
        result = 31 * result + (proDel != null ? proDel.hashCode() : 0);
        return result;
    }
}
