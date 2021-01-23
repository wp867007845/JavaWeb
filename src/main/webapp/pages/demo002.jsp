<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/23
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="live.driftmen.bean.User"></jsp:useBean>
<jsp:setProperty name="user" property="username" value="zhangsan"></jsp:setProperty>
<jsp:setProperty name="user" property="password" value="123456"></jsp:setProperty>
用户名：<jsp:getProperty name="user" property="username"/>
</body>
</html>
