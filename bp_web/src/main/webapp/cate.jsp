<%--
  Created by IntelliJ IDEA.
  User: leader1
  Date: 2022/7/19
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <title>分区</title>
    <link rel="stylesheet" href="${path}/resource/bootstrap/css/bootstrap.css">
</head>
<body>
<img src="${path}/resource/img/p2.jpg" class="img-fluid" alt="..." style="width: 100%">

<div class="jumbotron jumbotron-fluid" style="height: 130px">
    <div class="container">
        <h1 class="display-4">分区热度</h1>
    </div>
</div>

<div class="row">
    <div class="col-sm-6">
        <div id="main2" style="width: 800px;height:600px;"></div>
    </div>
    <div class="col-sm-6">
        <div class="dropdown" align="center">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="false">
                选择分区
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenu2">
                <a href="${path}/bili/cate.do?cate=anm" class="btn btn-primary">动物圈</a>
                <a href="${path}/bili/cate.do?cate=ane" class="btn btn-primary">动画</a>
                <a href="${path}/bili/cate.do?cate=fun" class="btn btn-primary">娱乐</a>
                <a href="${path}/bili/cate.do?cate=vid" class="btn btn-primary">影视</a>
                <a href="${path}/bili/cate.do?cate=shw" class="btn btn-primary">时尚</a>
                <a href="${path}/bili/cate.do?cate=car" class="btn btn-primary">汽车</a>
                <a href="${path}/bili/cate.do?cate=gme" class="btn btn-primary">游戏</a>
                <a href="${path}/bili/cate.do?cate=lve" class="btn btn-primary">生活</a>
                <a href="${path}/bili/cate.do?cate=tec" class="btn btn-primary">科技</a>
                <a href="${path}/bili/cate.do?cate=knl" class="btn btn-primary">知识</a>
                <a href="${path}/bili/cate.do?cate=fod" class="btn btn-primary">美食</a>
                <a href="${path}/bili/cate.do?cate=dan" class="btn btn-primary">舞蹈</a>
                <a href="${path}/bili/cate.do?cate=spt" class="btn btn-primary">运动</a>
                <a href="${path}/bili/cate.do?cate=msc" class="btn btn-primary">音乐</a>
                <a href="${path}/bili/cate.do?cate=gch" class="btn btn-primary">鬼畜</a>
                <a href="${path}/bili/cate.do?cate=" class="btn btn-primary">全部分区</a>

            </div>
        </div>
        <div id="main" style="width: 800px;height:600px;"></div>
    </div>
</div>
<script type="text/javascript" src="${path}/resource/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="${path}/resource/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${path}/resource/jquery/echarts.min.js"></script>


<script type="text/javascript">
    var chartDom = document.getElementById('main');
    var myChart = echarts.init(chartDom);
    var option;
    option = {
        title: {
            text: '分区币赞比',
            left: 'center'
        },
        tooltip: {
            trigger: 'item'
        },
        legend: {
            orient: 'vertical',
            left: 'left'
        },
        series: [
            {
                name: '占比',
                type: 'pie',
                radius: '50%',
                data: [
                    <c:forEach items="${catelogs}" var="bili">
                    { value: ${bili.cateCoin}, name:'${bili.cate}'+'投币' },
                    { value: ${bili.cateLike}, name:'${bili.cate}'+ '点赞' },
                    { value: ${bili.cateShare}, name: '${bili.cate}'+'分享' },
                    { value: ${bili.cateCollect}, name: '${bili.cate}'+'收藏' },
                    </c:forEach>
                ],
                emphasis: {
                    itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    option && myChart.setOption(option);

    var chartDom2 = document.getElementById('main2');
    var myChart2 = echarts.init(chartDom2);
    var option2;

    option2 = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                // Use axis to trigger tooltip
                type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
            }
        },
        legend: {},
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type: 'value'
        },
        yAxis: {
            type: 'category',
            data: [
                <c:forEach items="${bililogs}" var="bili">
                '${bili.cate}',
                </c:forEach>
            ]
        },
        series: [

            {
                name: '点赞',
                type: 'bar',
                stack: 'total',
                label: {
                    show: true
                },
                emphasis: {
                    focus: 'series'
                },
                data: [
                    <c:forEach items="${bililogs}" var="bili">
                    ${bili.cateLike},
                    </c:forEach>
                ]
            },
            {
                name: '硬币',
                type: 'bar',
                stack: 'total',
                label: {
                    show: true
                },
                emphasis: {
                    focus: 'series'
                },
                data: [
                    <c:forEach items="${bililogs}" var="bili">
                    ${bili.cateCoin},
                    </c:forEach>
                ]
            },
            {
                name: '收藏',
                type: 'bar',
                stack: 'total',
                label: {
                    show: true
                },
                emphasis: {
                    focus: 'series'
                },
                data: [
                    <c:forEach items="${bililogs}" var="bili">
                    ${bili.cateCollect},
                    </c:forEach>
                ]
            },
            {
                name: '分享',
                type: 'bar',
                stack: 'total',
                label: {
                    show: true
                },
                emphasis: {
                    focus: 'series'
                },
                data: [
                    <c:forEach items="${bililogs}" var="bili">
                    ${bili.cateShare},
                    </c:forEach>
                ]
            }
        ]
    };

    option2 && myChart2.setOption(option2);
</script>
</body>
</html>
