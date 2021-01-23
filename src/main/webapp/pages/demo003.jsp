<%--
  Created by IntelliJ IDEA.
  User: 86700
  Date: 2021/1/23
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${1==1}">
    toLowerCase:${fn:toLowerCase("Driftmen")}<br>
</c:if>

</body>
</html>
