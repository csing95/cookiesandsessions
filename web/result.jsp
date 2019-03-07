<%--
  Created by IntelliJ IDEA.
  User: csing
  Date: 3/6/2019
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:out value="${cookie[dude].value}"></c:out>
</body>
</html>
