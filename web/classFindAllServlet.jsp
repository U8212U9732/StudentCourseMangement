<%--
  Created by IntelliJ IDEA.
  User: 李纹纹
  Date: 2018/6/12
  Time: 16:41
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
<h1 class="text-center" style="font-size: 4em">学生课程查询</h1>
<div class="float-right" style="margin-bottom: 10px">
    <form action="/ClassFindByNameServlet" class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" name="find" type="search" placeholder="教师查询" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
    </form>
</div>
<table class="table table-bordered">
    <thead>
    <tr>
        <td style="width: 25%">课程名称</td>
        <td style="width: 25%">任课教师</td>
        <td style="width: 25%">教室编号</td>
        <td>操作功能</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${courseServiceAll}" var="course" varStatus="v">
        <tr>
            <td>${course.name}</td>
            <td>${course.teacher}</td>
            <td>${course.number}</td>
            <td>
                <button class="btn btn-info"
                        onclick="window.location='/UserClassAddServlet?action=insert&username=${user}&name=${course.name}&teacher=${course.teacher}&number=${course.number}'">
                    选择该课程
                </button>
                <button style="margin-left: 20px"
                        class="btn btn-info"
                        onclick="window.location='classUpdateServlet.jsp?action=update&id=${course.id}&name=${course.name}&teacher=${course.teacher}&number=${course.number}'">
                    修改
                </button>
                <button style="margin-left: 20px"
                        class="btn btn-danger"
                        onclick="window.location='/ClassDeleteServlet?action=delete&id=${course.id}'">
                    删除
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button onclick="window.location='classAddServlet.jsp'" type="button" class="btn btn-success btn-block btn-lg">添加
</button>
</body>
</html>
