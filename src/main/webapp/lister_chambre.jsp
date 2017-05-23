<%-- 
    Document   : lister_chambre.jsp
    Created on : 23 mai 2017, 09:47:41
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <c:import url="menu_servlet"></c:import>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste des chambre</h1>
        <table border="2px solid black">
            <c:forEach items="${listeChambres}" var="c">
                <tr><td>${c.id}</td><td>${c.nom}</td><td>${c.disponibilte}</td><td>${c.hotel.nom}</td></tr>
            </c:forEach>
        </table>
            <c:import url='_footer.jsp'></c:import>
    </body>
</html>
