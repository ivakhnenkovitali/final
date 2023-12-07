<%@ page import="by.IT.constants.ApplicationConstants" %>
<%@ page import="by.IT.constants.JspConstants" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<p>
    <a href="<%= ApplicationConstants.LOGIN_CONTROLLER%>">Logout</a>
</p>

<h2>User Info:</h2>
<p>login: ${user.login}</p>
<p>login: ${user.name}</p>
<p>login: ${user.email}</p>
</body>
</html>
