<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/23
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:import var="data" url="demo003.jsp"/>--%>
<c:import var="data" url="https://www.cnblogs.com/ajax/wechatshare/getconfig?url=https%3A%2F%2Fwww.cnblogs.com%2F"/>
<c:out value="${data}"/>
</body>
</html>
