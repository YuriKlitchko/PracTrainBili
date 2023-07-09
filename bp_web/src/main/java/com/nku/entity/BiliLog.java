package com.nku.entity;

import java.io.Serializable;

public class BiliLog implements Serializable {
    private String cate;
    private int cateView;
    private int cateLike;
    private int cateCoin;
    private int cateCollect;
    private int cateShare;
    private float coinLike;
    private float collectLike;
    private float shareLike;

    public BiliLog() {
    }


    public BiliLog(String cate, int cateView, int cateLike, int cateCoin, int cateCollect, int cateShare, float coinLike, float collectLike, float shareLike) {
        this.cate = cate;
        this.cateView = cateView;
        this.cateLike = cateLike;
        this.cateCoin = cateCoin;
        this.cateCollect = cateCollect;
        this.cateShare = cateShare;
        this.coinLike = coinLike;
        this.collectLike = collectLike;
        this.shareLike = shareLike;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getCateView() {
        return cateView;
    }

    public void setCateView(int cateView) {
        this.cateView = cateView;
    }

    public int getCateLike() {
        return cateLike;
    }

    public void setCateLike(int cateLike) {
        this.cateLike = cateLike;
    }

    public int getCateCoin() {
        return cateCoin;
    }

    public void setCateCoin(int cateCoin) {
        this.cateCoin = cateCoin;
    }

    public int getCateCollect() {
        return cateCollect;
    }

    public void setCateCollect(int cateCollect) {
        this.cateCollect = cateCollect;
    }

    public int getCateShare() {
        return cateShare;
    }

    public void setCateShare(int cateShare) {
        this.cateShare = cateShare;
    }

    public float getCoinLike() {
        return coinLike;
    }

    public void setCoinLike(float coinLike) {
        this.coinLike = coinLike;
    }

    public float getCollectLike() {
        return collectLike;
    }

    public void setCollectLike(float collectLike) {
        this.collectLike = collectLike;
    }

    public float getShareLike() {
        return shareLike;
    }

    public void setShareLike(float shareLike) {
        this.shareLike = shareLike;
    }

    @Override
    public String toString() {
        return "BiliLog{" +
                "cate='" + cate + '\'' +
                ", cateView=" + cateView +
                ", cateLike=" + cateLike +
                ", cateCoin=" + cateCoin +
                ", cateCollect=" + cateCollect +
                ", cateShare=" + cateShare +
                ", coinLike=" + coinLike +
                ", collectLike=" + collectLike +
                ", shareLike=" + shareLike +
                '}';
    }
}
