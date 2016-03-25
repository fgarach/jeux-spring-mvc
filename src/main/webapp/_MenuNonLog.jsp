<%-- 
    Document   : _MENU
    Created on : 8 mars 2016, 14:59:05
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="menu">
    <input type="button" onclick="formulaireInscription();" value="Inscription"/>
    S'identifier
    <label>Login</label></td>  
<input type="text" name="login">
<label>Mot de passe</label>
<input type="password" name="mdp">
<input type="button" onclick="login();" value="Envoyer"/>
</div>