<%--
  Created by IntelliJ IDEA.
  User: Johnny
  Date: 6/20/2018
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/deleteUser" method="post">
    <table width="20%" border="1">
        <tr>
            <td>Selection</td>
            <td>Username</td>
        </tr>
        <tr>
            <td><input name="ids" value="1" type="checkbox"></td>
            <td>Tom</td>
        </tr>
        <tr>
            <td><input name="ids" value="2" type="checkbox"></td>
            <td>Jack</td>
        </tr>
        <tr>
            <td><input name="ids" value="3" type="checkbox"></td>
            <td>Lucy</td>
        </tr>
    </table>
    <input type="submit" value="Delete">
</form>
</body>
</html>
