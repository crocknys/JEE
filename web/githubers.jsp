<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 01/06/18
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
    <title>page other</title>
</head>
<body>

<jsp:include page="navbar.jsp"/>
<ul>
    <c:forEach items="${requestScope.liste}" var="currentGitHubber" >
        <li>${currentGitHubber}</li>
    </c:forEach>
</ul>

<jsp:include page="footer.jsp"/>
</body>
</html>
