<%-- 
    Document   : resultados
    Created on : 18 ene. 2020, 15:31:56
    Author     : Carlos
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
        <h2>Resultados de los equipos por etapa</h2>


        <c:forEach var="resultado" items="${resultados}">
            <c:url var="urlViewVehiculo" value="/dakar/vehiculos/${resultado.vehiculo.idVehiculo}"/>
            <c:url var="urlViewEtapa" value="/dakar/etapas/${resultado.etapa.idEtapa}"/>

             <c:choose>
                <c:when test="${resultado.etapa.idEtapa != lasRes.etapa.idEtapa}">
                </tbody>
            </table>

            <h3>Etapa: <a href="${urlViewEtapa}">${resultado.etapa.idEtapa}</a></h3>
            <p>
                Fecha: ${resultado.etapa.fecha} <br> Distancia: ${resultado.etapa.recorrido}km
            </p>
            <table style="border: solid black 1px;">
                <thead>
                    <tr>
                        <th style="border: solid black 1px;">Vehiculo</th>
                        <th style="border: solid black 1px;">Equipo</th>
                        <th style="border: solid black 1px;">Piloto</th>
                        <th style="border: solid black 1px;">Tiempo</th>
                    </tr>
                </thead>
                <tbody>
                </c:when> 

                <c:otherwise></c:otherwise>    
            </c:choose>

            <tr>
                <td style="border: solid black 1px;"><a href="${urlViewVehiculo}">${resultado.vehiculo.idVehiculo}</a></td>
                <td style="border: solid black 1px;">${resultado.vehiculo.nombreEquipo}</td>
                <td style="border: solid black 1px;">${resultado.vehiculo.piloto}</td>
                <td style="border: solid black 1px;">${resultado.tiempo}</td>
            </tr>
            <c:set var = "lasRes" scope = "application" value = "${resultado}"/>
        </c:forEach> 
    </tbody>
</table>

</body>
</html>