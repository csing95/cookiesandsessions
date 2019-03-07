<%--
  Created by IntelliJ IDEA.
  User: csing
  Date: 3/6/2019
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="doSomething" method="post">
    <input type="hidden" name="hiddena" value="start">
    <label for="username">Username: </label>
    <input type="text" id="username" name="username"><br>
    <label for="password">Password: </label>
    <input type="text" id="password" name="password"><br>
    <input type="submit">
  </form>
  </body>
</html>
