<%--
  Created by IntelliJ IDEA.
  User: landmyp
  Date: 2018/12/5
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改诗词</title>

    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body data-spy="scroll" data-target="#myScrollspy">

<div class="jumbotron" style="background-image: url('images/152532-149474673278a4.jpg')">

    <h1 align="center" style="font-family: 华文行楷">中华诗词</h1>
</div>

<div class="container">
<form class="form-horizontal" role="form" action="reupdatePoetry" method="post">
    <input type="hidden" name="poetry_id" value="${poetry1.poetry_id}">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">题目</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputEmail3" name="poetry_title" value="${poetry1.poetry_title}" />
        </div>
    </div>
    <div class="form-group">
        <label for="inputPoetryBody" class="col-sm-2 control-label">诗词体</label>
        <div class="col-sm-10">
            <textarea  class="form-control" rows="4" name="poetry_body" cols="20" id="inputPoetryBody"  >${poetry1.poetry_body}</textarea>
            <%--<input type="text" class="form-control" id="inputPoetryBody" name="poetry_body" value="${poetry1.poetry_body}" />--%>
        </div>
    </div>
    <div class="form-group">
        <label for="inputauthor" class="col-sm-2 control-label">作者</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputauthor" name="poetry_author" value="${poetry1.poetry_author}" />
        </div>
    </div>
    <div class="form-group">
        <label for="inputdynasty" class="col-sm-2 control-label">朝代</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputdynasty" name="poetry_dynasty" value="${poetry1.poetry_dynasty}" />
        </div>
    </div>



    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <a href="pageVo"> <button type="button" class="btn btn-default">放弃修改</button></a>
            <button type="submit" class="btn btn-default">确定修改</button>
        </div>
    </div>
</form>
</div>
</body>

</html>
