<%--
  Created by IntelliJ IDEA.
  User: landmyp
  Date: 2018/12/7
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <head>
        <title>分页查询结果</title>
        <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
</head>
<style>
    /* Custom Styles */
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
</style>
<script>
    $(document).ready(function(){
        $("#myNav").affix({
            offset: {
                top: 125
            }
        });
    });
</script>
</head>
<body data-spy="scroll" data-target="#myScrollspy">
<div class="container">
    <div class="jumbotron" style="background-image: url('images/152532-149474673278a4.jpg')">
        <h1 align="center">中华诗词</h1>
    </div>
    <div class="row">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" id="myNav">
                 <c:forEach items="${page.listDate}" var="vo" varStatus="i">
                     <li ><a href="#${i.count}">${vo.poetry_title}</a></li>
                 </c:forEach>
            </ul>


        </div>
        <div class="col-xs-9">
            <c:forEach items="${page.listDate}" var="vo" varStatus="i">
                <h1 style="font-family: 华文行楷">${vo.poetry_title}</h1>
                <h4>${vo.poetry_dynasty}  ${vo.poetry_author}</h4>
                <h3 id="${i.count}" style="font-family: 华文行楷">
                        <p>
                        ${vo.poetry_body}
                        </p>
                </h3>
                <hr>
            </c:forEach>
        </div>
    </div>


</div>
</body>
</html>
