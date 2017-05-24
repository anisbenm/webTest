<%-- 
    Document   : lister_hotels
    Created on : 22 mai 2017, 11:32:28
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
        <h1>Liste des hotels</h1>
        <table border="2px">
            <thead><th>id</th><th>nom</th><th>adresse</th><th>code postale</th><th>action</th></thead>
        <c:forEach items="${listeHotels}" var="h">
            <tr> <td>${h.id}</td><td>${h.nom}</td><td>${h.adresse}</td><td>${h.codePosta}</td><td><a href="supprimer_hotel?idHotel=${h.id}">supprimer</a></td></tr>
        </c:forEach>
        </table>
        <c:import url='_footer.jsp'></c:import>
    </body>
</html>
