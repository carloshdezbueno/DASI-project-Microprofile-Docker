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
        <h2>Lista de Vehiculos que participan en la prueba</h2>

        <table style="border: solid black 1px;">
            <thead>
                <tr>
                    <th style="border: solid black 1px;">Clasificacion</th>
                    <th style="border: solid black 1px;">Vehiculo</th>
                    <th style="border: solid black 1px;">Equipo</th>
                    <th style="border: solid black 1px;">Tipo</th>   
                    <th style="border: solid black 1px;">Piloto</th>
                    <th style="border: solid black 1px;">Copiloto</th>
                    <th style="border: solid black 1px;">Tiempo Total</th>
                    <td style="border: solid black 1px;">Acciones</td>


                </tr>
            </thead>
            <tbody>
                <c:forEach var="vehiculo" items="${vehiculos}">
                    <c:url var="urlDelVehiculo" value="/dakar/vehiculos/del/${vehiculo.idVehiculo}"/>
                    <c:url var="urlViewVehiculo" value="/dakar/vehiculos/${vehiculo.idVehiculo}"/>
                    <tr>
                        <td style="border: solid black 1px;">${vehiculo.clasificacion}</td>
                        <td style="border: solid black 1px;"><a href="${urlViewVehiculo}">${vehiculo.idVehiculo}</a></td>
                        <td style="border: solid black 1px;">${vehiculo.nombreEquipo}</td>
                        <td style="border: solid black 1px;">${vehiculo.tipo}</td>
                        <td style="border: solid black 1px;">${vehiculo.piloto}</td>
                        <td style="border: solid black 1px;">${vehiculo.copiloto}</td>
                        <td style="border: solid black 1px;">${vehiculo.tiempoTotal}</td>
                        <td style="border: solid black 1px;"><a href="${urlDelVehiculo}">Descalificar</a></td>


                    </tr>
                </c:forEach> 


            </tbody>
        </table>
        <c:url var="insertVehiculo" value="/dakar/vehiculos/insertarVehiculo"/>
        <p><a href="${insertVehiculo}">Registrar un nuevo vehiculo</a></p>
    </body>
</html>
