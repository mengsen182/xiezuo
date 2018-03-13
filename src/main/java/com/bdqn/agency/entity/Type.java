package com.bdqn.agency.entity;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public class Type {
    private int typeid;
    private String typeName;

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
