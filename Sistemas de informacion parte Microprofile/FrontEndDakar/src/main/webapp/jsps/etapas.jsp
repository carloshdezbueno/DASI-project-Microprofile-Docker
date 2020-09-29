<%-- 
    Document   : etapas
    Created on : 18 ene. 2020, 22:48:00
    Author     : albertogarciacampo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <body>
        <h2>Lista de etapas de la prueba</h2>

        <table style="border: solid black 1px;">
            <thead>
                <tr>
                    <th style="border: solid black 1px;">Etapa</th>
                    <th style="border: solid black 1px;">Fecha</th>
                    <th style="border: solid black 1px;">Recorrido</th>
           

                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="etapa" items="${etapas}">
                     <c:url var="urlViewEtapa" value="../dakar/etapas/${etapa.idEtapa}"/>
                    
                    <tr>
                        <td style="border: solid black 1px;"><a href="${urlViewEtapa}">${etapa.idEtapa}</a></td>
                        <td style="border: solid black 1px;">${etapa.fecha}</td>
                        <td style="border: solid black 1px;">${etapa.recorrido}</td>

                    </tr>
                </c:forEach> 
                    
            </tbody>
        </table>
    </body>
</html>
