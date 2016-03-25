<%-- 
    Document   : _MENU
    Created on : 8 mars 2016, 14:59:05
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="menu">

        <input type="button" onclick="nouvellePartie();" value="Nouvelle partie"/>
        <input type="button" onclick="partieEnCours();" value="Partie en cours"/>
        ${sessionScope.login}
        <input type="button" onclick="deconnexion();" value="Deconnexion"/>

</div>