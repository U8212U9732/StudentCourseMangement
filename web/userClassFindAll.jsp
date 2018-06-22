<%--
  Created by IntelliJ IDEA.
  User: 李纹纹
  Date: 2018/6/14
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="/weblib/jquery/jquery.js"></script>
    <script src="/weblib/bootstrap/js/bootstrap.js"></script>
    <link href="/weblib/bootstrap/css/bootstrap.css"
          rel="stylesheet">
</head>
<body>
<h1 class="text-center" style="font-size: 4em">学生所选课程</h1>
<table class="table table-bordered">
    <thead>
    <tr>
        <td style="width: 20%">学生名称</td>
        <td style="width: 20%">课程名称</td>
        <td style="width: 20%">任课教师</td>
        <td style="width: 20%">教室编号</td>
        <td>课程成绩</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${courseServiceAll}" var="course" varStatus="v">
        <tr>
            <td>${course.username}</td>
            <td>${course.classname}</td>
            <td>${course.classteacher}</td>
            <td>${course.classnumber}</td>
            <td>${course.sum}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button <%--onclick="window.location='/ClassFindAllServelt?action=add&name=${courseServiceAll.username}'"--%>
        onclick="javascript:history.back(-1);"
        type="button" class="btn btn-success btn-block btn-lg">返回课程列表
</button>
</body>
</html>
