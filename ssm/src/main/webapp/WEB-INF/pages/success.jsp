<%--
  Created by IntelliJ IDEA.
  User: 坦克
  Date: 2020/8/14
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}
    <br>
</c:forEach>
</body>
</html>
