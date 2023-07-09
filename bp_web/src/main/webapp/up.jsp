<%--
  Created by IntelliJ IDEA.
  User: leader1
  Date: 2022/7/19
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <title>up热度</title>
    <link rel="stylesheet" href="${path}/resource/bootstrap/css/bootstrap.css">
</head>
<body>
<img src="${path}/resource/img/p4.jpg" class="img-fluid" alt="..." style="width: 100%">

<div class="jumbotron jumbotron-fluid" style="height: 130px">
    <div class="container">
        <h1 class="display-2">up主分析</h1>
    </div>
</div>

<div class="row">
    <div class="col-sm-5">
        <div class="list-group">
            <a href="${path}/bili/up.do?index=0" class="list-group-item list-group-item-action">
                <div class="d-flex w-80 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(0).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(0).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(0).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=1" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(1).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(1).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(1).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=2" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(2).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(2).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(2).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=3" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(3).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(3).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(3).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=4" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(4).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(4).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(4).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=5" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(5).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(5).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(5).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=6" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(6).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(6).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(6).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=7" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(7).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(7).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(7).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=8" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(8).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(8).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(8).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=9" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(9).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(9).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(9).upView} k</small>
            </a >
            <a  href="${path}/bili/up.do?index=9" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1" style="font-size:x-large">${uplogs.get(9).up}</h5>
                </div>
                <p class="mb-1">总硬币：${uplogs.get(10).upCoin} k</p>
                <small class="text-muted">总播放：${uplogs.get(10).upView} k</small>
            </a >
        </div>
    </div>
    <div class="col-sm-7">
        <form>
            <div class="form-group">
                <label for="rank">寻找排名</label>
                <input type="text" class="form-control" id="rank" style="width: 600px">
            </div>
            <button type="button" class="btn btn-primary" onclick="findup();return false;" id="test">查询</button>
        </form>
        <ul class="list-group" style="width: 600px">
            <li class="list-group-item">up主：${upFound.up}</li>
            <li class="list-group-item">总播放：${upFound.upView} k</li>
            <li class="list-group-item">总硬币：${upFound.upCoin} k</li>
        </ul>
        <div id="main" style="width: 600px;height:400px;"></div>
        </br>
        <div id="main2" style="width: 800px;height:600px;"></div>
    </div>
</div>
<script type="text/javascript">
    function findup(){
        location.href="${path}/bili/up.do?index="+$('#rank').val();
        return false;
    }
</script>
<script type="text/javascript" src="${path}/resource/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="${path}/resource/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${path}/resource/jquery/echarts.min.js"></script>

<script type="text/javascript">
    var chartDom = document.getElementById('main');
    var myChart = echarts.init(chartDom);
    var option;

    option = {
        tooltip: {
            trigger: 'item'
        },
        legend: {
            top: '5%',
            left: 'center'
        },
        series: [
            {
                name: '操作',
                type: 'pie',
                radius: ['40%', '70%'],
                avoidLabelOverlap: false,
                itemStyle: {
                    borderRadius: 10,
                    borderColor: '#fff',
                    borderWidth: 2
                },
                label: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    label: {
                        show: true,
                        fontSize: '40',
                        fontWeight: 'bold'
                    }
                },
                labelLine: {
                    show: false
                },
                data: [

                    { value: ${upFound.upLike}, name: '点赞' },
                    { value: ${upFound.upCoin}, name: '投币' },
                    { value: ${upFound.upCollect}, name: '收藏' },
                    { value: ${upFound.upShare}, name: '分享' }
                ]
            }
        ]
    };

    option && myChart.setOption(option);

    var chartDom2 = document.getElementById('main2');
    var myChart2 = echarts.init(chartDom2);
    var option2;

    option2 = {
        title: {
            text: 'up之间的数据对比'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {},
        toolbox: {
            show: true,
            feature: {
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: [ '点赞', '投币', '收藏', '分享']
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                formatter: '{value}k'
            }
        },
        series: [
            {
                name: '${uplogs.get(0).up}',
                type: 'line',
                data: [${uplogs.get(0).upLike},${uplogs.get(0).upCoin},${uplogs.get(0).upCollect},${uplogs.get(0).upShare}]
            },
            {
                name: '${upFound.up}',
                type: 'line',
                data: [${upFound.upLike},${upFound.upCoin},${upFound.upCollect},${upFound.upShare}],
                markPoint: {
                    data: [
                        { type: 'max', name: 'Max' },
                        { type: 'min', name: 'Min' }
                    ]
                }
            },
            {
                name: '${allcates.cate}',
                type: 'line',
                data: [${allcates.cateLike},${allcates.cateCoin},${allcates.cateCollect},${allcates.cateShare}]
            },
        ]
    };

    option2 && myChart2.setOption(option2);
</script>
</body>
</html>
