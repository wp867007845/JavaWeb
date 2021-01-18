<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/18
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/resp06Servlet" method="post">
    用户名：<input type="text" name="username"><br/>
    密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
    <br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
