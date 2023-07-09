package com.nku.entity;

public class UpLog {
    private String up;
    private int upView;
    private int updanmaku;
    private int upLike;
    private int upCoin;
    private int upCollect;
    private int upShare;

    @Override
    public String toString() {
        return "UpLog{" +
                "up='" + up + '\'' +
                ", upView=" + upView +
                ", updanmaku=" + updanmaku +
                ", upLike=" + upLike +
                ", upCoin=" + upCoin +
                ", upCollect=" + upCollect +
                ", upShare=" + upShare +
                '}';
    }

    public UpLog(String up, int upView, int updanmaku, int upLike, int upCoin, int upCollect, int upShare) {
        this.up = up;
        this.upView = upView;
        this.updanmaku = updanmaku;
        this.upLike = upLike;
        this.upCoin = upCoin;
        this.upCollect = upCollect;
        this.upShare = upShare;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public int getUpView() {
        return upView;
    }

    public void setUpView(int upView) {
        this.upView = upView;
    }

    public int getUpdanmaku() {
        return updanmaku;
    }

    public void setUpdanmaku(int updanmaku) {
        this.updanmaku = updanmaku;
    }

    public int getUpLike() {
        return upLike;
    }

    public void setUpLike(int upLike) {
        this.upLike = upLike;
    }

    public int getUpCoin() {
        return upCoin;
    }

    public void setUpCoin(int upCoin) {
        this.upCoin = upCoin;
    }

    public int getUpCollect() {
        return upCollect;
    }

    public void setUpCollect(int upCollect) {
        this.upCollect = upCollect;
    }

    public int getUpShare() {
        return upShare;
    }

    public void setUpShare(int upShare) {
        this.upShare = upShare;
    }

    public UpLog() {
    }
}
