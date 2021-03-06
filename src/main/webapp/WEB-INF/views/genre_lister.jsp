<%-- 
    Document   : genre_lister
    Created on : 10 oct. 2016, 11:01:54
    Author     : Laurent-LIM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

        <h1>Liste des Genres</h1>
        <ul>
            <c:forEach items="${listegenre}" var="genre">

                <li>${genre.nom}
                    <a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                    <a href="<spring:url value="supprimer_genre/${genre.id}"/>">Supprimer</a>
                    <a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                    <a href="<spring:url value="modifier_genre/${genre.id}"/>">Modifier</a>
                </li>

            </c:forEach>
                
                <h4><a href="<spring:url value="/ajout_genre"></spring:url>">Ajouter un genre</a></h4>
                
        </ul>
        
        <a href="${index}">Page d'acceuil</a>


    </body>
</html>
