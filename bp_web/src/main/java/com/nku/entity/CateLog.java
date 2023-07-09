package com.nku.entity;

public class CateLog {
    String cate;
    int number;

    public CateLog(String cate, int number) {
        this.cate = cate;
        this.number = number;
    }

    public CateLog() {
    }

    @Override
    public String toString() {
        return "CateLog{" +
                "cate='" + cate + '\'' +
                ", number=" + number +
                '}';
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
