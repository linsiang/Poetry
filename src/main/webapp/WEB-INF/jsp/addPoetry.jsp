<%--
  Created by IntelliJ IDEA.
  User: landmyp
  Date: 2018/12/5
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>增加诗词</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body data-spy="scroll" data-target="#myScrollspy">
<div class="jumbotron" style="background-image: url('images/152532-149474673278a4.jpg')">

    <h1 align="center" style="font-family: 华文行楷">中华诗词</h1>
</div>

<div class="container">
    <form class="form-horizontal" role="form" action="addPoetry" method="post">
        <%--<input type="hidden" name="poetry_id" value="${poetry1.poetry_id}">--%>
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">题目</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEmail3" name="poetry_title"  placeholder="请在此处输入诗词题目"/>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPoetryBody" class="col-sm-2 control-label">诗词体</label>
            <div class="col-sm-10">
                <textarea  class="form-control" rows="4" name="poetry_body" cols="20" id="inputPoetryBody" placeholder="请在此处输入诗词体" ></textarea>
                <%--<input type="text" class="form-control" id="inputPoetryBody" name="poetry_body" value="${poetry1.poetry_body}" />--%>
            </div>
        </div>
        <div class="form-group">
            <label for="inputauthor" class="col-sm-2 control-label">作者</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputauthor" name="poetry_author" placeholder="请在此处输入作者"/>
            </div>
        </div>
        <div class="form-group">
            <label for="inputdynasty" class="col-sm-2 control-label">朝代</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputdynasty" name="poetry_dynasty" placeholder="请在此处输入作者所处的朝代"/>
            </div>
        </div>



        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Hand On</button>
            </div>
        </div>
    </form>
</div>
</body>

<%--<body>--%>
         <%--<form action="addPoetry" method="post">--%>
              <%--<table>--%>


                      <%--&lt;%&ndash;<tr>   <td>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;id:  <input type="text" name="poetry_id ">&ndash;%&gt;--%>
                      <%--&lt;%&ndash;</td> </tr>&ndash;%&gt;--%>
                      <%--<tr>   <td>--%>
                          <%--题目:  <input type="text" name="poetry_title">--%>
                      <%--</td> </tr>--%>
                      <%--<tr>   <td>--%>
                          <%--作者:  <input type="text" name="poetry_author">--%>

                      <%--</td> </tr>--%>
                      <%--<tr>   <td>--%>
                          <%--诗词体:  <input type="text" name="poetry_body">--%>
                      <%--</td> </tr>--%>
                      <%--<tr>   <td>--%>
                          <%--朝代:  <input type="text" name="poetry_dynasty">--%>
                      <%--</td> </tr>--%>
                 <%--<tr>--%>
                     <%--<td>--%>
                         <%--<input type="submit" value="HandOn"/>--%>
                     <%--</td>--%>
                 <%--</tr>--%>
              <%--</table>--%>

         <%--</form>--%>
<%--</body>--%>
</html>
