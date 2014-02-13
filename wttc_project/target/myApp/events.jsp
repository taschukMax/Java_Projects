<%--
  Created by IntelliJ IDEA.
  User: Maksym
  Date: 7/5/13
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Include Functions Tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Events</title>

    <link rel="stylesheet" type="text/css" href="wttc_project_ui/css/style.css">
    <link rel="stylesheet" type="text/css" href="wttc_project_ui/css/bootstrap.css">
    <script type="text/javascript" src="wttc/jquery.min.js"></script>
    <script type="text/javascript" src="wttc/jquery-ui.min.js"></script>
    <script src="wttc_project_ui/js/jquery.poshytip.js"></script>
    <script type="text/javascript" src="wttc_project_ui/js/app.js"></script>

</head>
<body>

<h2>Events for current tournament</h2>

<form name="eventsTable" method="post" action="SaveTournament">
    <c:choose>
        <c:when test="${not empty tournamentid}">
            <input type="hidden" name="tournamentid" value="${tournamentid}">
            Tournament Name: <input type="text" name="tournamentName" value="${tournamentDTO.tName}"
                                    id="tournamentName" class="form-control"><br>
            Tournament Date: <input type="text" name="tournamentDate" value="${tournamentDTO.date}"
                                    id="tournamentDate" class="form-control"><br>
            <input type="radio" name="stars" value="1"  <c:if test="${tournamentDTO.stars == 1}">
                   checked="true"</c:if>>1*
            <input type="radio" name="stars" value="2" <c:if test="${tournamentDTO.stars == 2}">
                   checked="true"</c:if>>2*
            <input type="radio" name="stars" value="3" <c:if test="${tournamentDTO.stars == 3}">
                   checked="true"</c:if>>3*
            <input type="radio" name="stars" value="4" <c:if test="${tournamentDTO.stars == 4}">
                   checked="true"</c:if>>4*
            <input type="radio" name="stars" value="5" <c:if test="${tournamentDTO.stars == 5}">
                   checked="true"</c:if>>5*
        </c:when>
        <c:otherwise>
            Tournament Name: <input type="text" name="tournamentName" id="tournamentName"><br>
            Tournament Date: <input type="text" name="tournamentDate" id="tournamentDate"><br>
            <input type="radio" name="stars" value="1">1*
            <input type="radio" name="stars" value="2">2*
            <input type="radio" name="stars" value="3" checked="true">3*
            <input type="radio" name="stars" value="4">4*
            <input type="radio" name="stars" value="5">5*
        </c:otherwise>
    </c:choose>

    <input type="hidden" name="AllEventsSize" value="${AllEventsSize + 6}">
    <table class="table table-hover">
        <tr>
            <th class="small_column">NO.</th>
            <th class="large_column">EVENT NAME</th>
            <th class="small_column">DAY</th>
            <th class="middle_column">TIME</th>
            <th class="middle_column">FEE</th>
            <th class="middle_column">1ST</th>
            <th class="middle_column">2ND</th>
            <th class="middle_column">3RD/4TH</th>
            <th class="middle_column">5/6</th>
            <th class="middle_column">7/8</th>
            <th class="small_column">USA TT</th>
            <th class="small_column">MAX Participants</th>
            <th>Fine Print</th>
        </tr>
        <c:forEach var="i" items="${AllEvents}" varStatus="count">

            <tr>
                <c:if test="${not empty tournamentid}">
                    <input type="hidden" name="eventid${count.count}" value="${i.id}">
                </c:if>
                <td>
                    <input type="text" value="${i.eventOrder}" name="event${count.count}" class="small_column">
                </td>
                <td>
                    <input type="text" value="${i.eventName}" name="eventName${count.count}" class="large_column">
                </td>
                <td>
                    <input type="text" value="${i.eventDate}" name="eventDate${count.count}" size="4"
                           class="small_column">
                </td>
                <td>
                    <input type="text" size="10" value="${i.eventTime}" name="eventTime${count.count}"
                           class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.fee}" name="fee${count.count}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.firstPl}" name="firstPl${count.count}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.secondPl}" name="secondPl${count.count}" size="7"
                           class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.thirdPl}" name="thirdPl${count.count}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.fifthPl}" name="fifthPl${count.count}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.seventhPl}" name="seventhPl${count.count}" size="7"
                           class="middle_column">
                </td>
                <td>
                    <c:if test="${i.usatt}"><input type="checkbox" checked="checked"
                                                   name="usatt${count.count}" class="small_column"></c:if>
                    <c:if test="${!i.usatt}"><input type="checkbox" name="usatt${count.count}"
                                                    class="small_column"></c:if>
                </td>
                <td>
                    <input type="text" value="${i.maxParticipants}" name="maxParticipants${count.count}"
                           size="7" class="small_column">
                </td>
                <td><textarea maxlength="2048" name="textPrint${count.count}"
                              class="text-area-default-size">${i.text}</textarea>
                </td>
            </tr>
        </c:forEach>
        <c:forEach begin="${AllEventsSize+1}" end="${AllEventsSize+6}" varStatus="count">
            <c:if test="${not empty tournamentid}">
                <input type="hidden" name="eventid${count.index}" value="${i.id}">
            </c:if>
            <tr>
                <td>
                    <input type="text" value="" id="order" name="event${count.index}" size="3" class="small_column">
                </td>
                <td>
                    <input type="text" value="" name="eventName${count.index}" class="large_column">
                </td>
                <td>
                    <input type="text" value="" name="eventDate${count.index}" size="4" class="small_column">
                </td>
                <td>
                    <input type="text" value="" name="eventTime${count.index}" size="10" class="middle_column">
                </td>
                <td>
                    <input type="text" value="" name="fee${count.index}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="" name="firstPl${count.index}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="" name="secondPl${count.index}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="" name="thirdPl${count.index}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.fifthPl}" name="fifthPl${count.index}" size="7" class="middle_column">
                </td>
                <td>
                    <input type="text" value="${i.seventhPl}" name="seventhPl${count.index}" size="7"
                           class="middle_column">
                </td>
                <td>
                    <input type="checkbox" checked="true" name="usatt${count.index}" class="small_column">
                </td>
                <td>
                    <input type="text" value="${i.maxParticipants}" name="maxParticipants${count.index}"
                           size="7" class="small_column"></td>
                <td><textarea maxlength="2048" name="textPrint${count.index}" class="text-area-default-size"></textarea>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>Add Details</h3>

    <input type="checkbox" id="adddetails">Add details:
    <table>
        <tr>
            <td>
                <b>ENTRY DEADLINE:</b>
            </td>
            <td>
                <textarea maxlength="2048" name="deadline" class="text-area-default-size"><c:if
                        test="${not empty tournamentid}">${tournamentDTO.deadline}</c:if> </textarea>
            </td>
        </tr>
        <tr>
            <td>
                <b>ENTRY POLICY/RATINGS:</b>
            </td>
            <td>
                <textarea maxlength="2048" name="policy" class="text-area-default-size"><c:if
                        test="${not empty tournamentid}">${tournamentDTO.policy}</c:if></textarea>
            </td>
        </tr>
        <tr>
            <td>
                <b>ELIGIBILITY:</b>
            </td>
            <td>
                <textarea maxlength="2048" name="eligibility" class="text-area-default-size"><c:if
                        test="${not empty tournamentid}">${tournamentDTO.eligibility}</c:if></textarea>
            </td>
        </tr>
    </table>
    <input type="submit" value="submit">

</form>
          <script>
              $('tr').draggable();
          </script>
</body>
</html>