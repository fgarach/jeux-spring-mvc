/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeux.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jeux.entity.Partie;
import jeux.entity.Utilisateur;
import jeux.service.PartieService;
import jeux.service.UtilisateurService;
import jeux.spring.AutowireServlet;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "NouvellePartie", urlPatterns = {"/nouvelle_partie"})
public class NouvellePartieServlet extends AutowireServlet {
    
    @Autowired
    UtilisateurService utilisateurService;
    
    @Autowired
    PartieService partieService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = (String) req.getSession().getAttribute("login");
        Utilisateur u = utilisateurService.findByLogin(login);
        Partie nouvellePartie = new Partie();
        partieService.save(nouvellePartie);
        u.getParties().add(nouvellePartie);
        utilisateurService.save(u);
        req.setAttribute("partie", nouvellePartie);
        req.getRequestDispatcher("_Jeux.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = (String) req.getSession().getAttribute("login");
        Utilisateur u = utilisateurService.findByLogin(login);
        Partie nouvellePartie = new Partie();
        partieService.save(nouvellePartie);
        u.getParties().add(nouvellePartie);
        utilisateurService.save(u);
        req.setAttribute("partie", nouvellePartie);
        req.getRequestDispatcher("_Jeux.jsp").forward(req, resp);
    }

    
}
