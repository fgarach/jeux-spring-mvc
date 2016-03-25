/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function init() {
    setTimeout(function () {
       cacheSablier();

    }, 3000);
    $('#menu').load('_MenuNonLog.jsp');
    $('#contenu').load('_Accueil.jsp');
}

function login() {
    afficheSablier();
    $('#menu').load('login', {login: $('[name=login]').val(), mdp: $('[name=mdp]').val()});
    $('#contenu').load('_Jeux.jsp');
    cacheSablier();
}
function afficheSablier() {

    $('.sablier').show();

}

function cacheSablier() {

    $('.sablier').hide();

}

function inscription() {
    afficheSablier();
    $('#contenu').load('inscription', {login: $('[name=logininsc]').val(), mdp: $('[name=mdpinsc]').val()});
    cacheSablier();
}

function formulaireInscription() {
    afficheSablier();
    $('#contenu').load('_Inscription.jsp');
    cacheSablier();
}

function deconnexion() {
    afficheSablier();
    $('#menu').load('deconnexion');
    $('#contenu').load('_Accueil.jsp');
    cacheSablier();
}

function nouvellePartie() {
    afficheSablier();
    $('#contenu').load('nouvelle_partie');
    cacheSablier();
}

function partieEnCours() {
    afficheSablier();
    $('#contenu').load('parties');
    cacheSablier();
}

