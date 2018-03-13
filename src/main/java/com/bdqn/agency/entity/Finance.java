package com.bdqn.agency.entity;

import com.alibaba.fastjson.annotation.JSONField;

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

    private int money;
    private double balance;
    private String remark;
    @JSONField(format = "yyyy-MM-dd HH-mm-ss")
    private Date createDate;
    private Type type;
    private int typeid;

    @Override
    public String toString() {
        return "Finance{" +
                "id=" + id +
                ", money=" + money +
                ", balance=" + balance +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                ", type=" + type +
                ", typeid=" + typeid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }
}
