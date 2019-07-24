<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/6/15
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示页面</title>
</head>
<body>
    <h1>spring mvc 测试成功</h1>

    <c:forEach items="${list}" var="account">
        ${account.name}<br/>
    </c:forEach>
</body>
</html>
