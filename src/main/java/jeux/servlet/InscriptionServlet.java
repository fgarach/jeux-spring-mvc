/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeux.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jeux.entity.Utilisateur;
import jeux.exception.UtilisateurDejaInscritException;
import jeux.service.InscriptionService;
import jeux.spring.AutowireServlet;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends AutowireServlet {
    
    @Autowired
    InscriptionService inscriptionService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Utilisateur u = new Utilisateur(req.getParameter("login"), req.getParameter("mdp"));
        try {
            inscriptionService.inscriptionUtilisateur(u);
            req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
        } catch (UtilisateurDejaInscritException ex) {
            req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
            return;
        }
        req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             
         
        Utilisateur u = new Utilisateur(req.getParameter("login"), req.getParameter("mdp"));
        try {
            inscriptionService.inscriptionUtilisateur(u);
            req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
        } catch (UtilisateurDejaInscritException ex) {
            req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
            return;
        }
        req.getRequestDispatcher("_Accueil.jsp").forward(req, resp);
    }
        
       
        
    }

