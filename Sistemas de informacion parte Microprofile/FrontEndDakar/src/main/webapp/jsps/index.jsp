<%-- 
    Document   : index
    Created on : 19 ene. 2020, 10:47:27
    Author     : Carlos
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
        <h1>Pagina de inicio del Dakar</h1>
        <c:url var="resultados" value="/dakar/resultados"/>
        <c:url var="etapas" value="/dakar/etapas"/>
        <c:url var="vehiculos" value="/dakar/vehiculos"/>
        <c:url var="insertVehiculo" value="/dakar/vehiculos/insertarVehiculo"/>
        
        
        <p><a href="${resultados}">Resultados del Dakar</a></p>
        <p><a href="${etapas}">Etapas del Dakar</a></p>
        <p><a href="${vehiculos}">Vehiculos del Dakar</a></p>
        <p><a href="${insertVehiculo}">Registrar un nuevo vehiculo</a></p>
    </body>
</html>
