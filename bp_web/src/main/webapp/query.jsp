<%--
  Created by IntelliJ IDEA.
  User: leader1
  Date: 2022/7/18
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <title>BiliBili视频分析</title>
    <link rel="stylesheet" href="${path}/resource/bootstrap/css/bootstrap.css">
</head>
<body>
<img src="${path}/resource/img/p1.jpg" class="img-fluid" alt="..." style="width: 100%">
    <div class="jumbotron jumbotron-fluid" style="height:200px">
        <div class="container">
            <h1 class="display-4">Bilibili视频分析</h1>
            <p class="lead"></p>
        </div>
    </div>

    <div class="row" align="center">
        <div class="col-sm-4">
            <div class="card border-warning mb-3" style="max-width: 18rem;">
                <img src="${path}/resource/img/01.jpg" class="card-img-top" style="width: 100px;height:100px;">
                <div class="card-body">
                    <h5 class="card-title">各区热度</h5>
                    <a href="${path}/bili/cate.do?cate=anm" class="btn btn-primary stretched-link">Go somewhere</a>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="card border-warning mb-3" style="max-width: 18rem;">
                <img src="${path}/resource/img/02.jpg" class="card-img-top" style="width: 100px;height:100px;">
                <div class="card-body">
                    <h5 class="card-title">热门视频分析</h5>
                    <a href="${path}/bili/hot.do" class="btn btn-primary stretched-link">Go somewhere</a>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="card border-warning mb-3" style="max-width: 18rem;">
                <img src="${path}/resource/img/03.jpg" class="card-img-top" style="width: 100px;height:100px;">
                <div class="card-body">
                    <h5 class="card-title">up主分析</h5>
                    <a href="${path}/bili/up.do" class="btn btn-primary stretched-link">Go somewhere</a>
                    <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="${path}/resource/jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="${path}/resource/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="${path}/resource/css/carousel.css"></script>
    <script type="text/javascript">

    </script>
</body>
</html>
