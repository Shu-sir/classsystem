package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_notice")
public class NoticeEntity {
    private int noticeId;
    private String noticeName;
    private String noticeDetails;
    private String noticeDate;
    private String noticeDel;

    @Id
    @Column(name = "notice_id")
    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "notice_name")
    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    @Basic
    @Column(name = "notice_details")
    public String getNoticeDetails() {
        return noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    @Basic
    @Column(name = "notice_date")
    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    @Basic
    @Column(name = "notice_del")
    public String getNoticeDel() {
        return noticeDel;
    }

    public void setNoticeDel(String noticeDel) {
        this.noticeDel = noticeDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (noticeId != that.noticeId) return false;
        if (noticeName != null ? !noticeName.equals(that.noticeName) : that.noticeName != null) return false;
        if (noticeDetails != null ? !noticeDetails.equals(that.noticeDetails) : that.noticeDetails != null)
            return false;
        if (noticeDate != null ? !noticeDate.equals(that.noticeDate) : that.noticeDate != null) return false;
        if (noticeDel != null ? !noticeDel.equals(that.noticeDel) : that.noticeDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noticeId;
        result = 31 * result + (noticeName != null ? noticeName.hashCode() : 0);
        result = 31 * result + (noticeDetails != null ? noticeDetails.hashCode() : 0);
        result = 31 * result + (noticeDate != null ? noticeDate.hashCode() : 0);
        result = 31 * result + (noticeDel != null ? noticeDel.hashCode() : 0);
        return result;
    }
}
