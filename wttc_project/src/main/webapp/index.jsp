<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<!-- Include Core Tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Include Functions Tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <script type="text/javascript" src="wttc_project_ui/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="wttc_project_ui/js/bootstrap.js"></script>
    <link rel="stylesheet" href="wttc_project_ui/css/bootstrap.css">
    <link rel="stylesheet" href="wttc_project_ui/css/bootstrap-responsive.css">
    <link rel="stylesheet" href="wttc_project_ui/css/style.css">
    <link href='http://fonts.googleapis.com/css?family=Oxygen:700' rel='stylesheet' type='text/css'>
    <title>WTTC</title>
</head>
<body>
<div class="wrapper">
    <h1 class="left-col">Westchester Table Tennis Center</h1>

    <div class="right-col">
        <h2>Recent Tournaments</h2>

        <form name="tournamenttype" action="allEvents" method="get">
            <div class="tournamenslist">
                <select name="tournament">
                    <c:forEach var="i" items="${AllTournaments}">
                        <option value="${i.id}">${i.tName}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="radio-wrapper">
                <label><input type="radio" name="page" value="new"
                              id="new" checked="checked">

                    <div class="new"><span class="title"> New</span></div>
                </label>
                <label><input type="radio" name="page" value="edit"
                              id="edit">

                    <div class="edit"><span class="title">Edit</span></div>
                </label>

                <label><input type="radio" name="page" value="export"
                              id="export">

                    <div class="export"><span class="title">Export</span></div>
                </label>
                <label><input type="radio" name="page" value="delete"
                              id="delete">

                    <div class="delete"><span class="title">Delete</span></div>
                </label>

            </div>

            <input type="submit" value="submit" class="btn btn-info">
        </form>
    </div>
</div>
<input type="button" id="btn" value="123">

<div class="events"></div>
<script type="text/javascript">
    $(document).ready(function () {
        $("#btn").click(function () {
            $.ajax({
                type: "POST",
                url: "events.jsp",
                cache: false,
                data: {"1":1},
                success: function (html) {
                    $(".events").append(html);
                }
            });
        });
    });
</script>
</body>
</html>
