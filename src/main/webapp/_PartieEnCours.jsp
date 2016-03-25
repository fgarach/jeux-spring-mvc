<%-- 
    Document   : _PartieEnCours
    Created on : 23 mars 2016, 16:54:10
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
    <br>
    <br>
    <br>
    <c:forEach items="${parties}" var="partie">
        ${partie.id} <input type="button" onclick="reprendre();" value="Reprendre la partie"/>
        <br>
    </c:forEach>
    <br>
    <br>
    <br>
</div>