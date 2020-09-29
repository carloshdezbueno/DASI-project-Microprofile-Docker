<%-- 
    Document   : etapa
    Created on : 19 ene. 2020, 0:18:23
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>${etapa.idEtapa}</h2>

    <p>Fecha de la etapa: ${etapa.fecha}</p>
    <p>Distancia de la etapa: ${etapa.recorrido} km</p>
    
</body>
</html>
