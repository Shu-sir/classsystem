package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_group")
public class GroupEntity {
    private int groId;
    private String groName;
    private int groStudentId;
    private String groDel;

    @Id
    @Column(name = "gro_id")
    public int getGroId() {
        return groId;
    }

    public void setGroId(int groId) {
        this.groId = groId;
    }

    @Basic
    @Column(name = "gro_name")
    public String getGroName() {
        return groName;
    }

    public void setGroName(String groName) {
        this.groName = groName;
    }

    @Basic
    @Column(name = "gro_student_id")
    public int getGroStudentId() {
        return groStudentId;
    }

    public void setGroStudentId(int groStudentId) {
        this.groStudentId = groStudentId;
    }

    @Basic
    @Column(name = "gro_del")
    public String getGroDel() {
        return groDel;
    }

    public void setGroDel(String groDel) {
        this.groDel = groDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEntity that = (GroupEntity) o;

        if (groId != that.groId) return false;
        if (groStudentId != that.groStudentId) return false;
        if (groName != null ? !groName.equals(that.groName) : that.groName != null) return false;
        if (groDel != null ? !groDel.equals(that.groDel) : that.groDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groId;
        result = 31 * result + (groName != null ? groName.hashCode() : 0);
        result = 31 * result + groStudentId;
        result = 31 * result + (groDel != null ? groDel.hashCode() : 0);
        return result;
    }
}
