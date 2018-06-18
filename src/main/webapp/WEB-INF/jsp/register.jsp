<%--
  Created by IntelliJ IDEA.
  User: Johnny
  Date: 6/15/2018
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    Username:<input type="text" name="username"><br>
    Password:<input type="text" name="password"><br>
    <input type="submit" value="Register">
</form>
</body>
</html>
