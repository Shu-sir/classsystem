package com.wanxi.entiry;

import javax.persistence.*;

/**
 * @author ：MR.Shu
 * @date ：Created in 2019/11/17 11:39
 * @description：
 */
@Entity
@Table(name = "t_user")
public class UserEntity {
    private long userId;
    private String userName;
    private String userPassword;
    private String userType;
    private int userNumber;
    private String userDel;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "user_number")
    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    @Basic
    @Column(name = "user_del")
    public String getUserDel() {
        return userDel;
    }

    public void setUserDel(String userDel) {
        this.userDel = userDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userNumber != that.userNumber) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (userDel != null ? !userDel.equals(that.userDel) : that.userDel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + userNumber;
        result = 31 * result + (userDel != null ? userDel.hashCode() : 0);
        return result;
    }
}
