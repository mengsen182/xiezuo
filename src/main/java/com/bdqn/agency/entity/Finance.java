package com.bdqn.agency.entity;

import java.util.Date;

/**
 * Created by houlingfeng on 2018/3/13.
 */
public class Finance {
    /**
     *
     FieldTypeComment
     idint(11) NOT NULL
     typevarchar(20) NOT NULL
     moneyint(11) NOT NULL
     balancedouble(10,2) NOT NULL
     remarkvarchar(50) NULL
     createdatedate NOT NULL
     */
    private int id;
    private int  typeid;
    private int money;
    private double balance;
    private String remark;
    private Date createDate;

    @Override
    public String toString() {
        return "Finance{" +
                "id=" + id +
                ", typeid=" + typeid +
                ", money=" + money +
                ", balance=" + balance +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
