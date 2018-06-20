<%--
  Created by IntelliJ IDEA.
  User: Johnny
  Date: 6/20/2018
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUsers" method="post">
    <table width="30%" border="1">
        <tr>
            <td>Selection</td>
            <td>Username</td>
        </tr>
        <tr>
            <td><input name="users[0].id" value="1" type="checkbox"></td>
            <td><input name="users[0].username" value="Tom" type="text"></td>
        </tr>
        <tr>
            <td><input name="users[1].id" value="2" type="checkbox"></td>
            <td><input name="users[1].username" value="Jack" type="text"></td>
        </tr>
        <tr>
            <td><input name="users[2].id" value="3" type="checkbox"></td>
            <td><input name="users[2].username" value="Lucy" type="text"></td>
        </tr>
    </table>
    <input type="submit" value="Edit">
</form>
</body>
</html>
