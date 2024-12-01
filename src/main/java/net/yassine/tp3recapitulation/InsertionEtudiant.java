package net.yassine.tp3recapitulation;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cin  = request.getParameter("cin");
        String name = request.getParameter("name");
        String moy = request.getParameter("moy");
        String url_img = request.getParameter("utl_img");
    }
}
