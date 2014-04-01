<%--
  Created by IntelliJ IDEA.
  User: maksym.tashchuk
  Date: 4/1/14
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User's Settings</title>
</head>
<body>
<h1>Your changes has been saved into Properties.ser file</h1>
<table border="1">
    <tr>
        <th>
            Font
        </th>
        <th>
            Size
        </th>
        <th>
            Color
        </th>
    </tr>
    <tr>
        <td>
            <span>${properties.getFont()}</span>
        </td>
        <td>
            <span>${properties.getFontSize()}</span>
        </td>
        <td>
            <span> ${properties.getFontColor()}</span>
        </td>
    </tr>
</table>
<hr>

<form action="Home" method="get">
    <input type="radio" name="option" value="See Changes">See Changes
    <br/>
    <input type="radio" name="option" value="Change Settings">Change Settings
    <br/>
    <input type="submit" name="action" value="Submit">
</form>
</body>
</html>