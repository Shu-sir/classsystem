package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_student_duty")
public class StudentDutyEntity {
    private int dutyId;
    private String dutyName;
    private String dutyDel;

    @Id
    @Column(name = "duty_id")
    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    @Basic
    @Column(name = "duty_name")
    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    @Basic
    @Column(name = "duty_del")
    public String getDutyDel() {
        return dutyDel;
    }

    public void setDutyDel(String dutyDel) {
        this.dutyDel = dutyDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDutyEntity that = (StudentDutyEntity) o;

        if (dutyId != that.dutyId) return false;
        if (dutyName != null ? !dutyName.equals(that.dutyName) : that.dutyName != null) return false;
        if (dutyDel != null ? !dutyDel.equals(that.dutyDel) : that.dutyDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dutyId;
        result = 31 * result + (dutyName != null ? dutyName.hashCode() : 0);
        result = 31 * result + (dutyDel != null ? dutyDel.hashCode() : 0);
        return result;
    }
}
