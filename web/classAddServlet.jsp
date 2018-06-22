<%--
  Created by IntelliJ IDEA.
  User: 李纹纹
  Date: 2018/6/13
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<h1 class="text-center" style="font-size: 4em">学生课程添加</h1>
<div class="text-center">
    <form action="/ClassAddServlet" class="form-horizontal">
        <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
        <div class="form-group">
            <label for="inputName3" class="col-sm-2 control-label">课程名称</label>
            <input type="text" name="name"
                   id="inputName3">
        </div>
        <div class="form-group">
            <label for="inputTeacher3" class="col-sm-2 control-label">任课教师</label>
            <input type="text" name="teacher"
                   id="inputTeacher3">
        </div>
        <div class="form-group">
            <label for="inputClass3" class="col-sm-2 control-label">教室编号</label>
            <input type="text" name="number"
                   id="inputClass3">
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
