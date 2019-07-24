<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/6/15
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>测试spring mvc</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>

    <h3>测试包</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="保存"/>
    </form>
</body>
</html>
