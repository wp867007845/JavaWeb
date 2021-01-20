<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/20
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/d05Servlet?username=流浪汉&password=Driftmen">登录（超链接）</a>

<form action="${pageContext.request.contextPath}/d05Servlet" method="post">
    <input type="text" name="username"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
