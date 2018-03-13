package com.bdqn.agency.entity;

import java.util.Date;

/**
 * Created by houlingfeng on 2018/3/13.
 */
public class User {
//    idint(11) NOT NULL
//    usernamevarchar(20) NOT NULL
//    passwordvarchar(20) NOT NULL
//    logindatedate NOT NULL
//    financeidint(11) NOT NULL财务id
    private int id;
    private String userName;
    private String password;
    private Date loginDate;
    private int financeId;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", loginDate=" + loginDate +
                ", financeId=" + financeId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getFinanceId() {
        return financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }
}
