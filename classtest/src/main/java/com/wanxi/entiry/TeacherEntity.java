package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_teacher")
public class TeacherEntity {
    private int teaId;
    private String teaName;
    private String teaSex;
    private String teaPhone;
    private String teaSchool;
    private String teaAddress;
    private String teaPicture;
    private String teaResume;
    private String teaEducation;
    private String teaDel;

    @Id
    @Column(name = "tea_id")
    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    @Basic
    @Column(name = "tea_name")
    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Basic
    @Column(name = "tea_sex")
    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    @Basic
    @Column(name = "tea_phone")
    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone;
    }

    @Basic
    @Column(name = "tea_school")
    public String getTeaSchool() {
        return teaSchool;
    }

    public void setTeaSchool(String teaSchool) {
        this.teaSchool = teaSchool;
    }

    @Basic
    @Column(name = "tea_address")
    public String getTeaAddress() {
        return teaAddress;
    }

    public void setTeaAddress(String teaAddress) {
        this.teaAddress = teaAddress;
    }

    @Basic
    @Column(name = "tea_picture")
    public String getTeaPicture() {
        return teaPicture;
    }

    public void setTeaPicture(String teaPicture) {
        this.teaPicture = teaPicture;
    }

    @Basic
    @Column(name = "tea_resume")
    public String getTeaResume() {
        return teaResume;
    }

    public void setTeaResume(String teaResume) {
        this.teaResume = teaResume;
    }

    @Basic
    @Column(name = "tea_education")
    public String getTeaEducation() {
        return teaEducation;
    }

    public void setTeaEducation(String teaEducation) {
        this.teaEducation = teaEducation;
    }

    @Basic
    @Column(name = "tea_del")
    public String getTeaDel() {
        return teaDel;
    }

    public void setTeaDel(String teaDel) {
        this.teaDel = teaDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (teaId != that.teaId) return false;
        if (teaName != null ? !teaName.equals(that.teaName) : that.teaName != null) return false;
        if (teaSex != null ? !teaSex.equals(that.teaSex) : that.teaSex != null) return false;
        if (teaPhone != null ? !teaPhone.equals(that.teaPhone) : that.teaPhone != null) return false;
        if (teaSchool != null ? !teaSchool.equals(that.teaSchool) : that.teaSchool != null) return false;
        if (teaAddress != null ? !teaAddress.equals(that.teaAddress) : that.teaAddress != null) return false;
        if (teaPicture != null ? !teaPicture.equals(that.teaPicture) : that.teaPicture != null) return false;
        if (teaResume != null ? !teaResume.equals(that.teaResume) : that.teaResume != null) return false;
        if (teaEducation != null ? !teaEducation.equals(that.teaEducation) : that.teaEducation != null) return false;
        if (teaDel != null ? !teaDel.equals(that.teaDel) : that.teaDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teaId;
        result = 31 * result + (teaName != null ? teaName.hashCode() : 0);
        result = 31 * result + (teaSex != null ? teaSex.hashCode() : 0);
        result = 31 * result + (teaPhone != null ? teaPhone.hashCode() : 0);
        result = 31 * result + (teaSchool != null ? teaSchool.hashCode() : 0);
        result = 31 * result + (teaAddress != null ? teaAddress.hashCode() : 0);
        result = 31 * result + (teaPicture != null ? teaPicture.hashCode() : 0);
        result = 31 * result + (teaResume != null ? teaResume.hashCode() : 0);
        result = 31 * result + (teaEducation != null ? teaEducation.hashCode() : 0);
        result = 31 * result + (teaDel != null ? teaDel.hashCode() : 0);
        return result;
    }
}
