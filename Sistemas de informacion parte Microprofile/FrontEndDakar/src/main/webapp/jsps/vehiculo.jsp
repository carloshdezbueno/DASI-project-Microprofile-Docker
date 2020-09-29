<%-- 
    Document   : vehiculos
    Created on : 18 ene. 2020, 16:05:49
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
        <h2>Vehiculo ${vehiculo.idVehiculo}</h2>


        <c:url var="urlDelVehiculo" value="/dakar/vehiculos/del/${vehiculo.idVehiculo}"/>
        <c:url var="urlViewVehiculo" value="/dakar/vehiculos/${vehiculo.idVehiculo}"/>

        <p>Clasificacion: ${vehiculo.clasificacion}</p>
        <p>Nombre del equipo: ${vehiculo.nombreEquipo}</p>
        <p>tipo de vehiculo: ${vehiculo.tipo}</p>
        <p>Piloto del vehiculo: ${vehiculo.piloto}</p>

        <c:choose>
            <c:when test="${vehiculo.tipo != 'Moto'}">
                <p>Copiloto del vehiculo: ${vehiculo.copiloto}</p>
            </c:when> 

        </c:choose>
        <p>Tiempo total en la prueba: ${vehiculo.tiempoTotal}</p>
        <br>
        <p><a href="${urlDelVehiculo}">Descalificar al vehiculo ${vehiculo.idVehiculo}</a></p>


    </body>
</html>
