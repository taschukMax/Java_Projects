<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Include Functions Tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Sports Retail Store</title>
    <style>
        .body {
            width: 100%;
            height: 400px;
        }

        .main {
            margin: auto;
            width: 300px;
            height: 150px;
        }
    </style>
</head>
<body>
<div class="body">
    <div class="main">
        <h3>Retail Store</h3>

        <form name="allBikes" action="PlaceOrder" method="get">
            <select name="bikes">
                <c:forEach var="bike" items="${allBikes}">
                    <option>${bike.getTitle()}: ${bike.getPrice()}$</option>
                </c:forEach>
            </select>
            <select name="quantity">
                <c:forEach var="bike" items="${allBikes}" varStatus="count">
                    <option>${count.count}</option>
                </c:forEach>
            </select>
            <input class="submit" type="submit" value="Order">
        </form>
    </div>
</div>
</body>
</html>