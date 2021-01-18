<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/17
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/req03Servlet" method="post">
    用户名：<input type="text" name="username"><br/>
    密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
    <br/>
    爱好：
    <input type="checkbox" name="hobby" value="sing"/>唱歌
    <input type="checkbox" name="hobby" value="dance"/>跳舞
    <input type="checkbox" name="hobby" value="game"/>玩游戏
    <input type="submit" value="提交"/>
</form>
</body>
</html>
