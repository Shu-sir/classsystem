package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_course_work")
public class CourseWorkEntity {
    private int workId;
    private String workName;
    private String workDescription;
    private int workCoursesId;
    private String workDate;
    private String workDel;

    @Id
    @Column(name = "work_id")
    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    @Basic
    @Column(name = "work_name")
    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Basic
    @Column(name = "work_description")
    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    @Basic
    @Column(name = "work_courses_id")
    public int getWorkCoursesId() {
        return workCoursesId;
    }

    public void setWorkCoursesId(int workCoursesId) {
        this.workCoursesId = workCoursesId;
    }

    @Basic
    @Column(name = "work_date")
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @Basic
    @Column(name = "work_del")
    public String getWorkDel() {
        return workDel;
    }

    public void setWorkDel(String workDel) {
        this.workDel = workDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseWorkEntity that = (CourseWorkEntity) o;

        if (workId != that.workId) return false;
        if (workCoursesId != that.workCoursesId) return false;
        if (workName != null ? !workName.equals(that.workName) : that.workName != null) return false;
        if (workDescription != null ? !workDescription.equals(that.workDescription) : that.workDescription != null)
            return false;
        if (workDate != null ? !workDate.equals(that.workDate) : that.workDate != null) return false;
        if (workDel != null ? !workDel.equals(that.workDel) : that.workDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workId;
        result = 31 * result + (workName != null ? workName.hashCode() : 0);
        result = 31 * result + (workDescription != null ? workDescription.hashCode() : 0);
        result = 31 * result + workCoursesId;
        result = 31 * result + (workDate != null ? workDate.hashCode() : 0);
        result = 31 * result + (workDel != null ? workDel.hashCode() : 0);
        return result;
    }
}
