<%--
  Created by IntelliJ IDEA.
  User: leader1
  Date: 2022/7/19
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <title>总热度</title>
    <link rel="stylesheet" href="${path}/resource/bootstrap/css/bootstrap.css">
</head>
<body>
<img src="${path}/resource/img/p3.jpg" class="img-fluid" alt="..." style="width: 100%">

<div class="jumbotron jumbotron-fluid" style="height: 130px">
    <div class="container">
        <h1 class="display-4">热门视频</h1>
    </div>
</div>

<div class="row">
    <div class="col-sm-4">
        <div id="main" style="width: 600px;height:400px;"></div>
    </div>
    <div class="col-sm-8">
        <div class="list-group">
            <a href=${videologs.get(0).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(0).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(0).videoCoin} 万   up主:${videologs.get(0).up}</p>
            <small class="text-muted">分区：${videologs.get(0).cate}</small>
            </a>
            <a href=${videologs.get(1).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(1).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(1).videoCoin} 万   up主：${videologs.get(1).up}</p>
            <small class="text-muted">分区：${videologs.get(1).cate}</small>
            </a>
            <a href=${videologs.get(2).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(2).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(2).videoCoin} 万   up主：${videologs.get(2).up}</p>
            <small class="text-muted">分区：${videologs.get(2).cate}</small>
            </a>
            <a href=${videologs.get(3).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(3).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(3).videoCoin} 万   up主：${videologs.get(3).up}</p>
            <small class="text-muted">分区：${videologs.get(3).cate}</small>
            </a>
            <a href=${videologs.get(4).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(4).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(4).videoCoin} 万   up主：${videologs.get(4).up}</p>
            <small class="text-muted">分区：${videologs.get(4).cate}</small>
            </a>
            <a href=${videologs.get(5).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(5).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(5).videoCoin} 万   up主：${videologs.get(5).up}</p>
            <small class="text-muted">分区：${videologs.get(5).cate}</small>
            </a>
            <a href=${videologs.get(6).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(6).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(6).videoCoin} 万   up主：${videologs.get(6).up}</p>
            <small class="text-muted">分区：${videologs.get(6).cate}</small>
            </a>
            <a href=${videologs.get(7).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(7).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(7).videoCoin} 万   up主：${videologs.get(7).up}</p>
            <small class="text-muted">分区：${videologs.get(7).cate}</small>
            </a>
            <a href=${videologs.get(8).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(8).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(8).videoCoin} 万   up主：${videologs.get(8).up}</p>
            <small class="text-muted">分区：${videologs.get(8).cate}</small>
            </a>
            <a href=${videologs.get(9).getBv()} class="list-group-item list-group-item-action">
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1" style="font-size: x-large">${videologs.get(9).videoName}</h5>
            </div>
            <p class="mb-1">投币数：${videologs.get(9).videoCoin} 万   up主：${videologs.get(9).up}</p>
            <small class="text-muted">分区：${videologs.get(9).cate}</small>
            </a>
        </div>
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
            text: '优秀视频分区占比',
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
                name: '来自分区',
                type: 'pie',
                radius: '50%',
                data: [
                    <c:forEach items="${catelogs}" var="bili">
                    { value: ${bili.number}, name:'${bili.cate}' },
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
</script>
</body>
</html>
