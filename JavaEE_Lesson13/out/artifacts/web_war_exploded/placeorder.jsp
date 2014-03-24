<%--
  Created by IntelliJ IDEA.
  User: maksym.tashchuk
  Date: 3/20/14
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title></title>
</head>
<body>

<h1>${message}</h1>
<table border="1">
    <tr>
        <th>Model</th>
        <th>Quantity</th>
    </tr>
    <tr>
        <c:forEach var="bike" items="${bikes}" varStatus="count">
            <td>${bike.getTitle()}</td>
            <td>${basketSize}</td>
        </c:forEach>

    </tr>
</table>

</body>
</html>