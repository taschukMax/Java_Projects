<%--
  Created by IntelliJ IDEA.
  User: Maksym
  Date: 3/31/14
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text Manipulations</title>
</head>
<body>
<form action="Properties" method="get" name="page-prop">
    <select name="font-size">
        <option value="10">10</option>
        <option value="12">12</option>
        <option value="14">14</option>
        <option value="20">14</option>
        <option value="22">14</option>
        <option value="36">14</option>
    </select>
    <select name="font">
        <option value="Verdana">Verdana</option>
        <option value="Comic-Sans MC">Comic-Sans MC</option>
        <option value="Arial">Arial</option>
    </select>
    <select name="font-color">
        <option value="blue">blue</option>
        <option value="yellow">yellow</option>
        <option value="red">red</option>
    </select>
    <input type="text" name="text"/>
    <input type="submit" value="Save"/>
</form>

</body>
</html>