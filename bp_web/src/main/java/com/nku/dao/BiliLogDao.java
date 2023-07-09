package com.nku.dao;

import com.nku.entity.BiliLog;
import com.nku.entity.UpLog;
import com.nku.entity.VideoLog;

import java.util.List;
import java.util.Map;

public interface BiliLogDao {
    List<BiliLog> cateFind(Map<String,Object> map);
    List<VideoLog> videoFind(Map<String,Object> map);
    List<UpLog> upFind(Map<String,Object> map);
}
