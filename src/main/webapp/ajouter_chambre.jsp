<%-- 
    Document   : ajouter_chambre
    Created on : 23 mai 2017, 10:35:18
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="menu_servlet"></c:import>
            <h1>Nouvelle chambre</h1>
            <form method="post">
                <label>nom chambre</label>
                <input name="nom"></input><br>
                <label>disoponibilite </label>
                <input name="dispo"></input><br>
                <label>Hotel </label>
                <select name="idHotel">
                <c:forEach items="${hotels}" var="h">
                    <option value='${h.id}'>${h.nom} </option>   
                    
                </c:forEach></select> 


            <br>
            <input type="submit" value="Ajouter"></input>
        </form>
        <c:import url='_footer.jsp'></c:import>
    </body>
</html>
