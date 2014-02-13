package com.westchestertabletennis.paymentgenerator.controller;

import com.westchestertabletennis.paymentgenerator.dao.EventDAO;
import com.westchestertabletennis.paymentgenerator.dao.TournamentDAO;
import com.westchestertabletennis.paymentgenerator.dto.EventDTO;
import com.westchestertabletennis.paymentgenerator.dto.TournamentDTO;
import org.apache.commons.lang.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletSaveTournament extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String allEventsSize = request.getParameter("AllEventsSize");
        String hiddenTournamentId = request.getParameter("tournamentid");
        TournamentDTO tournamentDTO = getTournamentDTO(request);
        TournamentDAO dao = new TournamentDAO();
        EventDAO eventDAO = new EventDAO();
        int id = 0;
        boolean newTournament = false;
        if (hiddenTournamentId == null) {
            id = dao.saveTournamentToDB(tournamentDTO);
            newTournament = true;
        } else {
            tournamentDTO.setId(Integer.valueOf(hiddenTournamentId));
            dao.updateTournamentInDB(tournamentDTO);
            id = Integer.valueOf(hiddenTournamentId);
            newTournament = false;
        }

        for (int i = 1; i <= Integer.valueOf(allEventsSize); i++) {
            EventDTO eventDTO = getEventDTO(request, id, i);

            if (newTournament) {
                if (isNotEmpty(eventDTO)) {
                    eventDAO.saveEventToDB(eventDTO);
                }
            } else {
                if (eventDTO.getId() > 0) {
                    if (isNotEmpty(eventDTO)) {
                        eventDAO.updateEventInDB(eventDTO);
                    } else {
                        eventDAO.deleteEmptyEventFromDB(eventDTO);
                    }
                } else {
                    if (isNotEmpty(eventDTO)) {
                        eventDAO.saveEventToDB(eventDTO);
                    }
                }//if no event ID
            }// if not new Tournament
        }//for
        response.sendRedirect("allTournaments");
    }

    private TournamentDTO getTournamentDTO(HttpServletRequest request) {
        TournamentDTO tournamentDTO = new TournamentDTO();
        tournamentDTO.settName(request.getParameter("tournamentName"));
        tournamentDTO.setDate(request.getParameter("tournamentDate"));
        tournamentDTO.setStars(Integer.valueOf(request.getParameter("stars")));
        tournamentDTO.setDeadline(request.getParameter("deadline"));
        tournamentDTO.setPolicy(request.getParameter("policy"));
        tournamentDTO.setEligibility(request.getParameter("eligibility"));
        return tournamentDTO;
    }

    private EventDTO getEventDTO(HttpServletRequest request, int id, int i) {
        String usatt;
        EventDTO eventDTO = new EventDTO();
        if (StringUtils.isNotEmpty(request.getParameter("eventid" + i))) {
            eventDTO.setId(Integer.valueOf(request.getParameter("eventid" + i)));
        }
        eventDTO.setTournamentid(id);
        usatt = request.getParameter("usatt" + i);
        eventDTO.setEventName(request.getParameter("eventName" + i));
        eventDTO.setEventDate(request.getParameter("eventDate" + i));
        eventDTO.setFee(request.getParameter("fee" + i));
        eventDTO.setFirstPl(request.getParameter("firstPl" + i));
        eventDTO.setSecondPl(request.getParameter("secondPl" + i));
        eventDTO.setThirdPl(request.getParameter("thirdPl" + i));
        eventDTO.setFifthPl(request.getParameter("fifthPl" + i));
        eventDTO.setSeventhPl(request.getParameter("seventhPl" + i));
        if (StringUtils.isNotEmpty(request.getParameter("maxParticipants" + i))) {
            eventDTO.setMaxParticipants(Integer.valueOf(request.getParameter("maxParticipants" + i)));
        }
        if (StringUtils.isNotEmpty(usatt)) {
            if (usatt.equals("on")) {
                usatt = "true";

            } else {
                usatt = "false";
            }
        }
        eventDTO.setUsatt(Boolean.valueOf(usatt));
        eventDTO.setText(request.getParameter("textPrint" + i));
        if (StringUtils.isNotEmpty(request.getParameter("event" + i))) {
            eventDTO.setEventOrder(Integer.valueOf(request.getParameter("event" + i)));
        }
        if (StringUtils.isNotEmpty(request.getParameter("eventTime" + i))) {
            eventDTO.setEventTime(request.getParameter("eventTime" + i));
        }
        return eventDTO;
    }

    private boolean isNotEmpty(EventDTO eventDTO) {
        return StringUtils.isNotEmpty(eventDTO.getEventName()) && StringUtils.isNotEmpty(eventDTO.getEventDate()) && StringUtils.isNotEmpty(eventDTO.getFee()) && StringUtils.isNotEmpty(eventDTO.getEventTime()) && eventDTO.getEventOrder() > 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
