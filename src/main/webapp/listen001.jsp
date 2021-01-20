<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/20
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>
    当前在线人数为：<%=application.getAttribute("count") %>
</h3>
<a href="<%=response.encodeUrl("listen002.jsp") %>">退出登录</a>
</body>
</html>
