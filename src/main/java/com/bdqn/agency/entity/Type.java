package com.bdqn.agency.entity;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public class Type {
    private int typeid;
    private String type;

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", type='" + type + '\'' +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
