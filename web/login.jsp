<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    application.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>学生课程管理系统-登录</title>
<link href="/weblib/bootstrap/css/bootstrap.css"
	rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>
.form-control {
	margin-bottom: 20px;
}

.col-md-6 {
	margin-top: 1em;
}

body {
	font-family: "Microsoft YaHei UI", serif;
	margin: 0;
	padding: 0;
}

.blur {
	background: rgba(233, 233, 233, .6);
	border-radius: 10px;
}
</style>
</head>
<body class="background">
	<section>
		<h2 class="form-signin-heading" style="padding-top: 10px; text-align: center; font-size: 70px; margin-bottom: 30px; ">
			学生课程管理系统
		</h2>
		<div class="container blur">
			<form class="form-signin" method="post" action="/UserLoginServlet">
				<h2 class="form-signin-heading" style="padding-top: 20px;">
					请登录：
					<p style="color: red" id="errorinfo_id">${returninfo }</p>
				</h2>
				<div class="form-group" id="Id_div">
					<input type="text" name="username" class="form-control"
						id="inputID" placeholder="用户名" required autofocus> <span
						class="glyphicon glyphicon-remove form-control-feedback"
						aria-hidden="true"></span>
				</div>
				<div class="form-group" id="Password_div">
					<input type="password" name="password" class="form-control"
						id="inputPassword" placeholder="密码 " required>
					<span class="glyphicon glyphicon-remove form-control-feedback"
						aria-hidden="true"></span>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" name="rememberMe">
						记住我
					</label>
				</div>
				<div class="row">
					<div class="col-md-6">
						<button class="btn btn-lg btn-primary btn-block" type="submit"
							id="submit_id">登录</button>
						<font style="color: red"><c:out value="${error}"></c:out></font>
					</div>
					<div class="col-md-6">
						<button onclick="window.open('${basePath }forget.jsp','_self');"
							type="button" class="btn btn-lg btn-primary btn-block">忘记密码
						</button>
					</div>
				</div>
			</form>
			<p style="height: 8px"></p>
		</div>
		<!-- /container -->
	</section>
	<script src="/weblib/jquery/jquery.js"></script>
	<script src="/weblib/bootstrap/js/bootstrap.js"></script>
	<script src="/js/canvas-nest.min.js"></script>
	<script>
    $(function () {
    	 var height = $(window).height(); //浏览器当前窗口可视区域高度
         var section_height = $("section").outerHeight(true);
         $("section").css("margin-top", (height / 2) - (section_height / 2));
         $(window).resize(function () {
             var height = $(window).height(); //浏览器当前窗口可视区域高度
             var section_height = $("section").outerHeight(true);
             $("section").css("margin-top", (height / 2) - (section_height / 2));
         });
    });
</script>
</body>
</html>