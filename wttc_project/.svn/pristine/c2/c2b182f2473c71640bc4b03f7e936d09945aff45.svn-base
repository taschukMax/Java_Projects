package com.westchestertabletennis.paymentgenerator.controller;

import com.westchestertabletennis.paymentgenerator.dao.TournamentDAO;
import com.westchestertabletennis.paymentgenerator.dto.TournamentDTO;

import java.io.IOException;
import java.util.List;

public class ServletGetAllTournaments extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        TournamentDAO dao = new TournamentDAO();
        List list = dao.readAllTournaments();
        request.setAttribute("AllTournaments", list);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
