<%--
  Created by IntelliJ IDEA.
  User: 坦克
  Date: 2020/8/14
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">点击查看</a>
<form action="account/saveUser" method="post">
    姓名：<input type="text" name="name">
    金额：<input type="text" name="money">
    <input type="submit" value="提交">
</form>
</body>
</html>
