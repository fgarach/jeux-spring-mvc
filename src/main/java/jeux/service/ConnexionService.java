/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeux.service;


import jeux.entity.Utilisateur;
import jeux.exception.LoginNonExistant;
import jeux.exception.MotDePasseIncorrect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ConnexionService {
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    public void connexion(String login, String mdp) throws LoginNonExistant, MotDePasseIncorrect{
        Utilisateur u = utilisateurService.findByLogin(login);

        if (u==null){
            throw new LoginNonExistant();
        }
        else if (!u.getMdp().equals(mdp)){
            throw new MotDePasseIncorrect();
        }
 
    }
    
}
