package com.nku.controller;

import com.nku.entity.BiliLog;
import com.nku.entity.CateLog;
import com.nku.entity.UpLog;
import com.nku.entity.VideoLog;
import com.nku.service.BiliLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/bili/")
public class BiliLogController {
    @Autowired
    private BiliLogService biliLogService;
    @RequestMapping("query.do")
    public String query(){
        return "query";
    }
    @RequestMapping("up.do")
    public String up(Model model,@RequestParam(name="index",defaultValue= "0")int index){
        List<UpLog> upLog=biliLogService.upFind();
        UpLog uFod=biliLogService.upFind(index);
        BiliLog allCate=biliLogService.cateallFind();
        model.addAttribute("uplogs",upLog);
        model.addAttribute("upFound",uFod);
        model.addAttribute("allcates",allCate);
        return "up";
    }
    @RequestMapping("cate.do")
    public String cate(Model model, @RequestParam(name="cate",defaultValue ="")String cate){
        List<BiliLog> biliLog=biliLogService.cateFind("");
        List<BiliLog> cateLog=biliLogService.cateFind(cate);
        model.addAttribute("bililogs",biliLog);
        model.addAttribute("catelogs",cateLog);
        return "cate";
    }
    @RequestMapping("hot.do")
    public String hot(Model model){
        List<VideoLog> videoLog=biliLogService.videoFind();
        List<CateLog> cateLog=biliLogService.hotFind();
        model.addAttribute("videologs",videoLog);
        model.addAttribute("catelogs",cateLog);
        return "hot";
    }
}
