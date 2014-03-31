<%--
  Created by IntelliJ IDEA.
  User: Maksym
  Date: 3/31/14
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User's page</title>
</head>
<body>
<form action="UserPage" method="get">
    <span style="font-size: ${pageProperties.getFontSize()}; color: ${pageProperties.getFontColor()}; font-family: ${pageProperties.getFont()}"> ${pageProperties.getText()} </span>
</form>
</body>
</html>