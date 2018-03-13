package com.bdqn.agency.entity;

import java.util.Date;

/**
 * Created by houlingfeng on 2018/3/13.
 */
public class Client {
    /**
     * idint(11) NOT NULL
     cliennamevarchar(20) NOT NULL
     corporatevarchar(20) NOT NULL
     registerdatedate NOT NULL
     typevarchar(20) NOT NULL
     statusvarchar(20) NOT NULL
     */
    private int id;
    private String clienName;
    private String corporate;
    private Date registerDate;
    private String type;
    private String status;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clienName='" + clienName + '\'' +
                ", corporate='" + corporate + '\'' +
                ", registerDate=" + registerDate +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClienName() {
        return clienName;
    }

    public void setClienName(String clienName) {
        this.clienName = clienName;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
