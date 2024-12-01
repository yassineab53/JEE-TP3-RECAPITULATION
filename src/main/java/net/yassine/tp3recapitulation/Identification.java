package net.yassine.tp3recapitulation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Identification")
public class Identification extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");


        if (login.equals(password)) {
            RequestDispatcher rd = request.getRequestDispatcher("AffichageEtudiants");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("echec.html");
            rd.forward(request, response);
        }
    }
}
