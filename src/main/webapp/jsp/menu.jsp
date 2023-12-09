<ul class="nav-ul">
    <li class="nav-li float-left">
        <a class="active" href="<%= JspConstants.INDEX_JSP%>">Home</a>
    </li>
    <c:chose>
        <c:when test="${empty user}">
            <li class="nav-li">
                <a href="<%= JspConstants.INDEX_JSP%>">Login</a>
            </li>
            <li class="nav-li">
                <a href="<%= JspConstants.INDEX_JSP%>">Registration</a>
            </li>
        </c:when>
        <c:otherwise>
            <li class="nav-li">
                <a href="<%= ApplicationConstants.REGISTRATION_CONTROLLER%>">Logout</a>
            </li>
        </c:otherwise>
    </c:chose>
</ul>






