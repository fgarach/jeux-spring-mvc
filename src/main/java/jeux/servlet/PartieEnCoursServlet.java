/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeux.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jeux.entity.Partie;
import jeux.entity.Utilisateur;
import jeux.service.UtilisateurService;
import jeux.spring.AutowireServlet;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "PartieEnCours", urlPatterns = {"/parties"})
public class PartieEnCoursServlet extends AutowireServlet {
    
    @Autowired
    UtilisateurService utilisateurService;

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String login = (String) req.getSession().getAttribute("login");
//        Utilisateur u = utilisateurService.findByLogin(login);
//        List<Partie> parties = new ArrayList();
//        parties = u.getParties();
//        req.setAttribute("parties", parties);
//        req.getRequestDispatcher("_PartieEnCours.jsp").forward(req, resp);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("iciiiiii *************");
//        String login = (String) req.getSession().getAttribute("login");
//        Utilisateur u = utilisateurService.findByLogin(login);
//        System.out.println(u.getLogin());
//        List<Partie> parties = new ArrayList();
//        parties = u.getParties();
//        System.out.println(parties.size());
//        req.setAttribute("parties", parties);
        req.getRequestDispatcher("_PartieEnCours.jsp").forward(req, resp);
    }

    
}
