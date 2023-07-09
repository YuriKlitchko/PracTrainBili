package com.nku.entity;

public class VideoLog {
    private String cate;
    private String videoName;
    private String up;
    private String bv;
    private int videoCoin;



    @Override
    public String toString() {
        return "VideoLog{" +
                "cate='" + cate + '\'' +
                ", videoName='" + videoName + '\'' +
                ", up='" + up + '\'' +
                ", bv='" + bv + '\'' +
                ", videoCoin=" + videoCoin +
                '}';
    }

    public VideoLog() {
    }

    public VideoLog(String cate, String videoName, String up, String bv, int videoCoin) {
        this.cate = cate;
        this.videoName = videoName;
        this.up = up;
        this.bv = bv;
        this.videoCoin = videoCoin;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getBv() {
        return "https://www.bilibili.com/video/"+bv;
    }

    public void setBv(String bv) {
        this.bv = bv;
    }

    public int getVideoCoin() {
        return videoCoin;
    }

    public void setVideoCoin(int videoCoin) {
        this.videoCoin = videoCoin;
    }
}
