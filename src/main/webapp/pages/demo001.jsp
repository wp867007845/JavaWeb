<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/22
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StringBuilder sb = new StringBuilder();
    sb.append("你好！");
    sb.append("流浪汉！");
%>
<h1>Hello.Driftmen,这是jsp！</h1>
<h2><%=sb%></h2>
</body>
</html>
