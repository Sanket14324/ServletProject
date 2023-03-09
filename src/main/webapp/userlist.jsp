<%--
  Created by IntelliJ IDEA.
  User: sanke
  Date: 06-02-2023
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
  if(session.getAttribute("username") == null){
    response.sendRedirect("login.jsp");
  }
%>

UserList

<form action="logout">
<input type="submit" value="Logout">
</form>

</body>
</html>
