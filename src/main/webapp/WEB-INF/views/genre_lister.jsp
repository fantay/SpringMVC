<%-- 
    Document   : genre_lister
    Created on : 10 oct. 2016, 11:01:54
    Author     : Laurent-LIM
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

        <h1>Liste des Genres</h1>
        <ul>
            <c:forEach items="${listegenre}" var="genre">

                <li>${genre.nom}
                    <a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                    <a href="supprimer_genre/${genre.id}">Supprimer</a>
                    <a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
                    <a href="">Modifier</a>
                </li>

            </c:forEach>
        </ul>
        
        <a href="${index}">Page d'acceuil</a>


    </body>
</html>
