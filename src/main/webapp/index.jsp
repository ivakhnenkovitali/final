<%@ page import="by.IT.constants.ApplicationConstants" %>
<%@ page import="by.IT.constants.JspConstants" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>

    <title>Pizza 2211</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<jsp:include page="<%= JspConstants.MENU_JSP%>"/>
<img src="default-image" src="<%= JspConstants.BACKGROUND_IMAGE%>" alt="pizza">
<h1 style="position: absolute; top: 50%; width: 100%; text-align: center; ">
    Top 3 of the best Pizzas You can Try!!!
</h1>
</body>

</html>
