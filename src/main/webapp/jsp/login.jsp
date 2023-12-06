<%@ page import="by.IT.constants.ApplicationConstants" %>
<%@ page import="by.IT.constants.JspConstants" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<biv class="form-box">
    <h2>login</h2>
    <form method="post" action="<%= ApplicationConstants.LOGIN_CONTROLLER %>">
        <input name="<%= JspConstants.LOGIN_PARAM%>" placeholder="Login">
        <input type="password" name="<%= JspConstants.PASS_PARAM%>" placeholder="Password">   <!--3video 46min -->
        <input type="submit" value="Login">
    </form>
<c:if test="${not empty message}">
    <h2 class="error">${message}</h2>
</c:if>
</biv>

</body>
</html>
