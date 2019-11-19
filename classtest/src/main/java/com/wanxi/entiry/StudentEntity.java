package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_student")
public class StudentEntity {
    private int stuId;
    private String stuName;
    private String stuSex;
    private String stuBirthday;
    private String stuPhone;
    private String stuParent;
    private String stuParentPhone;
    private String stuAddress;
    private String stuPicture;
    private Integer stuDutyId;
    private Integer stuGroupId;
    private String stuDel;

    @Id
    @Column(name = "stu_id")
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "stu_name")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "stu_sex")
    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Basic
    @Column(name = "stu_birthday")
    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    @Basic
    @Column(name = "stu_phone")
    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Basic
    @Column(name = "stu_parent")
    public String getStuParent() {
        return stuParent;
    }

    public void setStuParent(String stuParent) {
        this.stuParent = stuParent;
    }

    @Basic
    @Column(name = "stu_parent_phone")
    public String getStuParentPhone() {
        return stuParentPhone;
    }

    public void setStuParentPhone(String stuParentPhone) {
        this.stuParentPhone = stuParentPhone;
    }

    @Basic
    @Column(name = "stu_address")
    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    @Basic
    @Column(name = "stu_picture")
    public String getStuPicture() {
        return stuPicture;
    }

    public void setStuPicture(String stuPicture) {
        this.stuPicture = stuPicture;
    }

    @Basic
    @Column(name = "stu_duty_id")
    public Integer getStuDutyId() {
        return stuDutyId;
    }

    public void setStuDutyId(Integer stuDutyId) {
        this.stuDutyId = stuDutyId;
    }

    @Basic
    @Column(name = "stu_group_id")
    public Integer getStuGroupId() {
        return stuGroupId;
    }

    public void setStuGroupId(Integer stuGroupId) {
        this.stuGroupId = stuGroupId;
    }

    @Basic
    @Column(name = "stu_del")
    public String getStuDel() {
        return stuDel;
    }

    public void setStuDel(String stuDel) {
        this.stuDel = stuDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (stuId != that.stuId) return false;
        if (stuName != null ? !stuName.equals(that.stuName) : that.stuName != null) return false;
        if (stuSex != null ? !stuSex.equals(that.stuSex) : that.stuSex != null) return false;
        if (stuBirthday != null ? !stuBirthday.equals(that.stuBirthday) : that.stuBirthday != null) return false;
        if (stuPhone != null ? !stuPhone.equals(that.stuPhone) : that.stuPhone != null) return false;
        if (stuParent != null ? !stuParent.equals(that.stuParent) : that.stuParent != null) return false;
        if (stuParentPhone != null ? !stuParentPhone.equals(that.stuParentPhone) : that.stuParentPhone != null)
            return false;
        if (stuAddress != null ? !stuAddress.equals(that.stuAddress) : that.stuAddress != null) return false;
        if (stuPicture != null ? !stuPicture.equals(that.stuPicture) : that.stuPicture != null) return false;
        if (stuDutyId != null ? !stuDutyId.equals(that.stuDutyId) : that.stuDutyId != null) return false;
        if (stuGroupId != null ? !stuGroupId.equals(that.stuGroupId) : that.stuGroupId != null) return false;
        if (stuDel != null ? !stuDel.equals(that.stuDel) : that.stuDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId;
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        result = 31 * result + (stuSex != null ? stuSex.hashCode() : 0);
        result = 31 * result + (stuBirthday != null ? stuBirthday.hashCode() : 0);
        result = 31 * result + (stuPhone != null ? stuPhone.hashCode() : 0);
        result = 31 * result + (stuParent != null ? stuParent.hashCode() : 0);
        result = 31 * result + (stuParentPhone != null ? stuParentPhone.hashCode() : 0);
        result = 31 * result + (stuAddress != null ? stuAddress.hashCode() : 0);
        result = 31 * result + (stuPicture != null ? stuPicture.hashCode() : 0);
        result = 31 * result + (stuDutyId != null ? stuDutyId.hashCode() : 0);
        result = 31 * result + (stuGroupId != null ? stuGroupId.hashCode() : 0);
        result = 31 * result + (stuDel != null ? stuDel.hashCode() : 0);
        return result;
    }
}
