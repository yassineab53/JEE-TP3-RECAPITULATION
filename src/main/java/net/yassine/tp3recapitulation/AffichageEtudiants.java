package net.yassine.tp3recapitulation;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "affichageetudiants", value = "/affichage-etudiants")
public class AffichageEtudiants extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();



        out.println("<html>");
        out.println("<head>");
        out.println("<title>Affichage etudiants</title>");
        out.println("<style>tr:nth-child(even) {\n" +
                "            background-color: #D6EEEE;\n" +
                "        }</style>");

        //out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Affichage etudiants</h1>");
        out.println("<ul>");
        out.println("<h1>Liste des Etudiants</h1>");

        /*for (Etudiant etudiant : GestionEtudiants.getListeEtudiants()) {
            out.println("<p>nom: " + etudiant.getNom() + " cin: " + etudiant.getCin() +
                    " moyenne: " + etudiant.getMoyenne() + "</p>");
        }*/
        //ex2
       /* for (Etudiant etudiant : GestionEtudiants.getListeEtudiants()) {
            out.println("<li>nom: " + etudiant.getNom() + " cin: " + etudiant.getCin() +
                    " moyenne: " + etudiant.getMoyenne() + "</li>");
        }*/
        //ex3
        out.println("<table border='1'>");
        out.println("<tr><th>CIN</th><th>Nom</th><th>Moyenne</th><th>Photo</th></tr>");
        for (Etudiant etudiant : GestionEtudiants.getListeEtudiants()) {
            if(etudiant.getMoyenne() < 10 ){
                out.println("<tr style =\"background-color:red\">");
            } else{
                out.println("<tr style=\"background-color:yellow\">");
            }

            out.println("<td>" + etudiant.getCin() + "</td>");
            out.println("<td>" + etudiant.getNom() + "</td>");
            out.println("<td>" + etudiant.getMoyenne() + "</td>");
            out.println("<td>" + etudiant.getMoyenne() + "</td>");
            //out.println("<td>" + etudiant.getImage() + "</td>");
            out.println("<td><img src='images/" + etudiant.getImage() + "' width='40' height='40'></td>");
            out.println("</tr>");
        }
        out.println("</table>");



        out.println("</ul>");
        out.println("</body></html>");

        out.close();
    }
}
