package com.westchestertabletennis.paymentgenerator.controller;

import com.westchestertabletennis.paymentgenerator.dao.EventDAO;
import com.westchestertabletennis.paymentgenerator.dao.TournamentDAO;
import com.westchestertabletennis.paymentgenerator.dto.EventDTO;
import org.apache.commons.lang.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ServletGetAllEvents extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tournamentid = request.getParameter("tournament");
        String pageValue = request.getParameter("page");
        if (pageValue.equals("edit")) {
            request.setAttribute("tournamentid", tournamentid);
        }
        if (pageValue.equals("edit") || pageValue.equals("new")) {
            request.setAttribute("tournamentDTO", new TournamentDAO().readTournamentById(Integer.valueOf(tournamentid)));
            EventDAO eventDAO = new EventDAO();
            List list = eventDAO.readAllEvents(tournamentid);
            request.setAttribute("AllEvents", list);
            request.setAttribute("AllEventsObject", eventDAO.readAllEvents(tournamentid));

            request.setAttribute("AllEventsSize", list.size());
            request.getRequestDispatcher("/events.jsp").forward(request, response);
        }


        if (pageValue.equals("export")) {
            request.setAttribute("tournamentid", tournamentid);
            request.setAttribute("dto", new TournamentDAO().readTournamentById(Integer.valueOf(tournamentid)));

            EventDAO eventDAO = new EventDAO();
            List list = eventDAO.readAllEvents(tournamentid);
            request.setAttribute("AllEvents", list);
            int counter = 0;
            boolean thirdPl = false, fifthPl = false, seventhPl = false;
            for (Object o : list) {
                EventDTO dto = (EventDTO) o;
                if (StringUtils.isNotEmpty(dto.getThirdPl())) {
                    thirdPl = true;
                }
                if (StringUtils.isNotEmpty(dto.getFifthPl())) {
                    fifthPl = true;
                }

                if (StringUtils.isNotEmpty(dto.getSeventhPl())) {
                    seventhPl = true;
                }
            }
            request.setAttribute("thirdPlColumn", thirdPl);
            request.setAttribute("fifthPlColumn", fifthPl);
            request.setAttribute("seventhPlColumn", seventhPl);
            request.setAttribute("counter", counter);
            request.setAttribute("AllEvents", list);
            request.setAttribute("AllEventsSize", list.size());
            request.getRequestDispatcher("/final.jsp").forward(request, response);
        }
        if (pageValue.equals("delete")) {
            new TournamentDAO().deleteTournamentFromDB(Integer.valueOf(tournamentid));
            response.sendRedirect("allTournaments");
        }
    }
}
