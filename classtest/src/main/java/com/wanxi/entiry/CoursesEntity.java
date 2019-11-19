package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_courses")
public class CoursesEntity {
    private int courId;
    private String courName;
    private int courTeacherId;
    private String courDel;

    @Id
    @Column(name = "cour_id")
    public int getCourId() {
        return courId;
    }

    public void setCourId(int courId) {
        this.courId = courId;
    }

    @Basic
    @Column(name = "cour_name")
    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    @Basic
    @Column(name = "cour_teacher_id")
    public int getCourTeacherId() {
        return courTeacherId;
    }

    public void setCourTeacherId(int courTeacherId) {
        this.courTeacherId = courTeacherId;
    }

    @Basic
    @Column(name = "cour_del")
    public String getCourDel() {
        return courDel;
    }

    public void setCourDel(String courDel) {
        this.courDel = courDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursesEntity that = (CoursesEntity) o;

        if (courId != that.courId) return false;
        if (courTeacherId != that.courTeacherId) return false;
        if (courName != null ? !courName.equals(that.courName) : that.courName != null) return false;
        if (courDel != null ? !courDel.equals(that.courDel) : that.courDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courId;
        result = 31 * result + (courName != null ? courName.hashCode() : 0);
        result = 31 * result + courTeacherId;
        result = 31 * result + (courDel != null ? courDel.hashCode() : 0);
        return result;
    }
}
