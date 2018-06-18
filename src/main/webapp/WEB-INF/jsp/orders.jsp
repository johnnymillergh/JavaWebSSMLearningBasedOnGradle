<%--
  Created by IntelliJ IDEA.
  User: Johnny
  Date: 6/15/2018
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Orders Query</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
    Order ID:<input type="number" name="ordersId"><br>
    User ID:<input type="text" name="user.username"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
