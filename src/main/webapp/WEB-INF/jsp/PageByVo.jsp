<%--
  Created by IntelliJ IDEA.
  User: landmyp
  Date: 2018/12/5
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分页查询结果</title>
    <link rel="stylesheet" href="css/div边框.css">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="pageVo"> <button type="button" class="btn btn-default" >首页</button></a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav">
                        <li >
                            <a href="#">


                                <button type="button" class="btn btn-default" >霹雳诗词</button>


                            </a>
                        </li>
                        <li>
                            <a href="#"> <button type="button" class="btn btn-default" >名家诗词</button></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <button type="button" class="btn btn-default" >更多</button><strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">网友自创</a>
                                </li>
                                <li>
                                    <a href="#">祥锅出品</a>
                                </li>
                                <li>
                                    <a href="#">己亥杂诗</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <div style="float: right">
                    <form class="navbar-form navbar-left" role="search" action="searchByName" method="post">
                        <div class="form-group" >
                            <%--value="请输入..." onfocus="this.value=''" onblur="this.value='请输入...'"--%>
                            <input type="text" class="form-control" name="poetry_author" placeholder="输入作者名字进行查询..." />
                        </div> <button type="submit" class="btn btn-default" >查询</button>
                    </form>

                         <a href="toAddPoetry">
                             <button type="button" class="btn btn-default" style="margin-top: 8.5px">增加诗词</button>

                         </a>

                </div>

                </div>

            </nav>


            <%--为了使得顶部的大导航栏不把第一行给盖掉--%>
            <br>
            <br>
            <br>
            <br>


            <div class="row clearfix"  >
                <c:forEach items="${page.listDate}" var="vo" step="1" varStatus="count">
                    <div class="col-md-4 column" style="height: 400px;position: relative;overflow:auto"  border-top:1px solid #000;border-bottom:1px solid #000>
                        <div class="box9" >
                        <h2 align="center">
                           <span style="font-size: smaller;color: chocolate;font-family: 华文行楷">${vo.poetry_title}</span>
                        </h2>
                        <p align="center">
                            <span style="font-family:华文彩云;font-size:larger" >${vo.poetry_dynasty} ${vo.poetry_author}</span>
                        </p>

                        <p align="left">
                            <span style="color: black;font-family: 华文行楷;font-size: 15px" >${vo.poetry_body}</span>

                        </p>
                            <div style="position: absolute;bottom: 0;left: 210px" >
                                <a href="${pageContext.request.contextPath}/deleteById?id=${vo.poetry_id}">删除</a>
                                <a href="${pageContext.request.contextPath}/toUpdate?id=${vo.poetry_id}"><span>修改</span></a>
                            </div>


                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<form>


</form>
<hr>


<div align="center">
<ul class="pagination">

    <li><a href="pageVo?currentPage=1">首页&raquo;</a></li>
    <c:if test="${page.currentPage==1}">
            <li class="disabled"><a>&laquo;first</a></li>
    </c:if>
    <c:if test="${page.currentPage>1}">
        <li><a href="pageVo?currentPage=${page.currentPage-1}">&laquo;last</a></li>
    </c:if>

    <c:forEach begin="${page.beginPage}" end="${page.endPage}" varStatus="i">

        <c:if test="${page.currentPage==(i.count+page.beginPage-1)}">
            <li class="active"><a href="pageVo?currentPage=${i.count+page.beginPage-1}">${i.count+page.beginPage-1}</a></li>
            </a>
        </c:if>
        <c:if test="${page.currentPage!=(i.count+page.beginPage-1)}">

            <li><a href="pageVo?currentPage=${i.count+page.beginPage-1}">${i.count+page.beginPage-1}</a></li>
        </c:if>
    </c:forEach>
    <c:if test="${page.currentPage==page.totalPage}">

            <li class="disabled">
                <a >finally&raquo;</a>
            </li>
    </c:if>
    <c:if test="${page.currentPage!=page.totalPage}">
        <li><a href="pageVo?currentPage=${page.currentPage+1}">next&raquo;</a></li>
    </c:if>
    <li><a href="pageVo?currentPage=${page.totalPage}">尾页&raquo;</a></li>
</ul>
    <div align="center" >
        <!-- <input type="text" class="form-control" name="currentPage" placeholder="请输入页码"> -->
        <form class="form-inline" role="form" action="pageVo" method="get">
            <div class="form-group">

                <input type="text" class="form-control" name="currentPage" placeholder="请输入页码">
            </div>
            <button type="submit" class="btn btn-default">跳转</button><span> 第${page.currentPage}页 /共${page.totalPage}页</span>
        </form>
    </div>
</div>

<div class="jumbotron" style="background-image: url('images/152532-149474673278a4.jpg')">

    <h1 align="center" style="font-family: 华文行楷">中华诗词</h1>
</div>


</body>

<script>

    // function fn() {
    //     window.location.href="deleteById?";
    //
    // }

</script>
</html>
