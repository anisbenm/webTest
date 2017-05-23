<%-- 
    Document   : ajouter_hotel
    Created on : 22 mai 2017, 14:37:23
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
        <h1>Nouvel Hotel</h1>
        <form method="post">
            <label>nom hotel</label>
            <input name="nom"></input><br>
            <label>adresse </label>
            <input name="adresse"></input><br>
            <label>code postal</label>
            <input name="zip"></input><br>
            <input type="submit" value="Ajouter"></input>
        </form>
            <c:import url='_footer.jsp'></c:import>
    </body>
</html>
