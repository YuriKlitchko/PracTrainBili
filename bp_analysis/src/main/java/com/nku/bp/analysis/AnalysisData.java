package com.nku.bp.analysis;

import com.nku.bp.analysis.tool.AnalysisCategoryTool;
import com.nku.bp.analysis.tool.AnalysisUpTool;
import com.nku.bp.analysis.tool.AnalysisVideoTool;
import org.apache.hadoop.util.ToolRunner;

public class AnalysisData {
    public static void main(String[] args) throws Exception {
        // 提交一个实现Tool接口的类，执行
        // 本项目中可选分析类别或分析视频两种
        ToolRunner.run(new AnalysisUpTool(), args);
    }
}