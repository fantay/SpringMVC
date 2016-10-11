<%-- 
    Document   : ajout_genre
    Created on : 10 oct. 2016, 16:28:58
    Author     : Laurent-LIM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajout d'un genre</h1>
              
        <form:form modelAttribute="newGenre">
            <label>Nom du genre</label>
            <form:input path="nom" />
            <input type="submit" value="Ajouter"/>
        </form:form>
        
        
    </body>
</html>
