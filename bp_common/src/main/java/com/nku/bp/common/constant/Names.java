package com.nku.bp.common.constant;

public enum  Names {
    NAMESPACE("bp")     // bilibili project
    ,TABLE("bp:bilibili")
    ,INFO("info")
    ,TOPIC("bp");

    private String name;

    private Names(String name){
        this.name = name;
    }

    public void setValue(Object val) {
        this.name = (String) val;
    }

    public String getValue() {
        return name;
    }
}
