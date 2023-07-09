package com.nku.service.impl;


import com.nku.dao.BiliLogDao;
import com.nku.entity.BiliLog;
import com.nku.entity.CateLog;
import com.nku.entity.UpLog;
import com.nku.entity.VideoLog;
import com.nku.service.BiliLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BiliLogServiceImpl implements BiliLogService {
    @Autowired
    private BiliLogDao biliLogDao;

    @Override
    public List<BiliLog> cateFind(String cate) {
        Map<String,Object> map=new HashMap<>();
        map.put("cate","%");
        List<BiliLog> biliLog=biliLogDao.cateFind(map);
        if(!cate.equals("")){
            BiliLog b=new BiliLog();
            List<BiliLog> cateLog=new ArrayList<>();
            if(cate.equals("anm")){
                cateLog.add(biliLog.get(0));
            }
            if(cate.equals("ane")){
                cateLog.add(biliLog.get(1));
            }
            if(cate.equals("fun")){
                cateLog.add(biliLog.get(2));
            }
            if(cate.equals("vid")){
                cateLog.add(biliLog.get(3));
            }
            if(cate.equals("shw")){
                cateLog.add(biliLog.get(4));
            }
            if(cate.equals("car")){
                cateLog.add(biliLog.get(5));
            }
            if(cate.equals("gme")){
                cateLog.add(biliLog.get(6));
            }
            if(cate.equals("lve")){
                cateLog.add(biliLog.get(7));
            }
            if(cate.equals("tec")){
                cateLog.add(biliLog.get(8));
            }
            if(cate.equals("knl")){
                cateLog.add(biliLog.get(9));
            }
            if(cate.equals("fod")){
                cateLog.add(biliLog.get(10));
            }
            if(cate.equals("dan")){
                cateLog.add(biliLog.get(11));
            }
            if(cate.equals("spt")){
                cateLog.add(biliLog.get(12));
            }
            if(cate.equals("msc")){
                cateLog.add(biliLog.get(13));
            }
            if(cate.equals("gch")){
                cateLog.add(biliLog.get(14));
            }
            return cateLog;
        }
        return biliLog;
    }

    @Override
    public BiliLog cateallFind() {
        Map<String,Object> map=new HashMap<>();
        map.put("cate","%");
        List<BiliLog> biliLog=biliLogDao.cateFind(map);
        BiliLog allCate=new BiliLog("平均数据",0,0,0,0,0,0.0f,0.0f,0.0f);
        for (BiliLog b:biliLog) {
            allCate.setCateCoin(b.getCateCoin()+allCate.getCateCoin());
            allCate.setCateView(b.getCateView()+allCate.getCateView());
            allCate.setCateLike(b.getCateLike()+allCate.getCateLike());
            allCate.setCateCollect(b.getCateCollect()+allCate.getCateCollect());
            allCate.setCateShare(b.getCateShare()+allCate.getCateShare());
        }
        return allCate;
    }

    @Override
    public List<VideoLog> videoFind() {
        Map<String,Object> map=new HashMap<>();
        map.put("video","");
        List<VideoLog> videoLog=biliLogDao.videoFind(map);
        return videoLog;
    }

    @Override
    public List<CateLog> hotFind() {
        Map<String,Object> map=new HashMap<>();
        map.put("video","");
        List<VideoLog> videoLog=biliLogDao.videoFind(map);
        List<CateLog> cateLog=new ArrayList<>();
        for (int i=0;i<100;i++){
            int k=0;
            for (CateLog c:cateLog) {
                if(videoLog.get(i).getCate().equals(c.getCate())){
                    k++;
                    c.setNumber(c.getNumber()+1);
                }
            }
            if(k==0){
                CateLog c=new CateLog(videoLog.get(i).getCate(),1);
                cateLog.add(c);
            }
        }
        return cateLog;
    }

    @Override
    public List<UpLog> upFind() {
        Map<String,Object> map=new HashMap<>();
        map.put("up","");
        List<UpLog> upLog=biliLogDao.upFind(map);
        return upLog;
    }

    @Override
    public UpLog upFind(int index) {
        Map<String,Object> map=new HashMap<>();
        map.put("up","");
        List<UpLog> upLog=biliLogDao.upFind(map);
        return upLog.get(index);
    }
}
