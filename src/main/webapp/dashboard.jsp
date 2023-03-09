<%--
  Created by IntelliJ IDEA.
  User: sanke
  Date: 06-02-2023
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>

    <h2>Hey you are on the dashboard ${username}</h2>

    <a href="userlist.jsp">List</a>

    <form action="logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
