<%--
  Created by IntelliJ IDEA.
  User: 李纹纹
  Date: 2018/6/12
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="/weblib/bootstrap/css/bootstrap.css"
          rel="stylesheet">
</head>
<body>
<h1 class="text-center" style="font-size: 4em">学生课程修改</h1>
<div class="text-center">
    <form action="/ClassUpdateServlet" class="form-horizontal">
        <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
        <div class="form-group">
            <label for="inputName3" class="col-sm-2 control-label">课程名称</label>
            <input type="text" name="name"
                   id="inputName3" value="<%=request.getParameter("name")%>">
        </div>
        <div class="form-group">
            <label for="inputTeacher3" class="col-sm-2 control-label">任课教师</label>
            <input type="text" name="teacher"
                   id="inputTeacher3" value="<%=request.getParameter("teacher")%>">
        </div>
        <div class="form-group">
            <label for="inputClass3" class="col-sm-2 control-label">教室编号</label>
            <input type="text" name="number"
                   id="inputClass3" value="<%=request.getParameter("number")%>">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-lg btn-success" style="width: 28em;">提交</button>
        </div>
    </form>
</div>
<script src="/weblib/jquery/jquery.js"></script>
<script src="/weblib/bootstrap/js/bootstrap.js"></script>
</body>
</html>
