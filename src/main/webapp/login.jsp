<%--
  Created by IntelliJ IDEA.
  User: landmyp
  Date: 18-12-12
  Time: 下午7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>css3炫酷登录页</title>
	<meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
	<meta name="author" content="Vincent Garreau" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<link rel="stylesheet" media="screen" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/reset.css"/>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">


</head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrap.css"></script>

<style type="text/css">

	#disappare{border:3px solid #ccc;border-radius: 5px;background: #fff;font-size: 20px;
		width: 300px;height: 250px;position: fixed;top:50%;left: 50%;margin:-125px 0 0 -150px;}
	#disappare h2{height: 35px;line-height: 35px;background: #ddd;text-indent: 5px;}
	#disappare p{padding: 5px;font-size: 16px;}
</style>
<body>


<div id="content">

	<div id="disappare" style="display:none;">

		<p>登录成功！！</p>
	</div>
</div>

<div id="particles-js">
	<div class="login">
		<div class="login-top" align="center">
			<p style="margin: auto">登录后台管理系统</p>
		</div>
		<div class="login-center clearfix">
			<div class="login-center-img"><img src="img/name.png"/></div>
			<div class="login-center-input">
				<input type="text" id="uname" value="" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
				<div class="login-center-input-text">用户名</div>
			</div>
		</div>
		<div class="login-center clearfix">
			<div class="login-center-img"><img src="img/password.png"/></div>
			<div class="login-center-input">
				<input type="password" id="pwd"value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
				<div class="login-center-input-text">密码</div>
			</div>
		</div>

		<div class="login-button" >
			<%--<button   type="button" class="btn btn-primary" >登录</button>--%>
			<button type="button" class="btn btn-primary btn-lg btn-block" id="toLogin">登录</button>
		</div>

	</div>
	<div class="sk-rotating-plane"></div>
</div>

<!-- scripts -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
<script type="text/javascript">
	$("#toLogin").click(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/login",
			data:{
				uname:$("#uname").val(),
				pwd:$("#pwd").val()

			},
			success:function(d){
				if(d!=null){
					addClass(document.querySelector(".login"), "active")
					setTimeout(function(){
						addClass(document.querySelector(".sk-rotating-plane"), "active")
						document.querySelector(".login").style.display = "none"
					},800)
					setTimeout(function(){
						removeClass(document.querySelector(".login"), "active")
						removeClass(document.querySelector(".sk-rotating-plane"), "active")
						document.querySelector(".login").style.display = "block"
						$("#disappare").show().delay(1000).hide(300);
						window.location.href="pageVo";
					},2000)
				};

			},
			error:function(d){
				addClass(document.querySelector(".login"), "active")
				setTimeout(function(){
					addClass(document.querySelector(".sk-rotating-plane"), "active")
					document.querySelector(".login").style.display = "none"
				},800)
				setTimeout(function(){
					removeClass(document.querySelector(".login"), "active")
					removeClass(document.querySelector(".sk-rotating-plane"), "active")
					document.querySelector(".login").style.display = "block"
					alert("用户名或者密码错误！！登录失败！！")
				},3000)

			},
			dataType:"json",
			type:"post"

		});

	});
	function hasClass(elem, cls) {
		cls = cls || '';
		if (cls.replace(/\s/g, '').length == 0) return false; //当cls没有参数时，返回false
		return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
	}

	function addClass(ele, cls) {
		if (!hasClass(ele, cls)) {
			ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
		}
	}

	function removeClass(ele, cls) {
		if (hasClass(ele, cls)) {
			var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
			while (newClass.indexOf(' ' + cls + ' ') >= 0) {
				newClass = newClass.replace(' ' + cls + ' ', ' ');
			}
			ele.className = newClass.replace(/^\s+|\s+$/g, '');
		}
	}
</script>
</body>
</html>
