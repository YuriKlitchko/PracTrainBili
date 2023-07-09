package com.nku.service;

import com.nku.entity.BiliLog;
import com.nku.entity.CateLog;
import com.nku.entity.UpLog;
import com.nku.entity.VideoLog;

import java.util.List;
import java.util.Map;

public interface BiliLogService {
    List<BiliLog> cateFind(String cate);
    BiliLog cateallFind();
    List<VideoLog> videoFind();
    List<CateLog> hotFind();
    List<UpLog> upFind();
    UpLog upFind(int index);
}
