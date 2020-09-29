<%-- 
    Document   : formInsertarVehiculo
    Created on : 19 ene. 2020, 2:21:49
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
        <h2>Insertar Nuevo Vehiculo Participante</h2>

        <c:if test="${not empty errores}">
            <ul>
                <c:forEach var="error" items="${errores}">
                    <li>${error}</li>
                    </c:forEach>
            </ul>
        </c:if>

        <c:url var="urlInsertar" value="../../dakar/vehiculos"/>
        <form  action="${urlInsertar}" method="POST">
            <table style="with: 50%">
                <tr>
                    <td>Identificacion --- (Marca+Numero. Ej:Toyota3)</td>
                    <td><input type="text" name="idVehiculo" value="${vehiculo.idVehiculo}"/></td>
                </tr>
                <tr>
                    <td>Nombre Equipo</td>
                    <td><input type="text" name="nombreEquipo" value="${vehiculo.nombreEquipo}"/></td>
                </tr>
                <tr>
                    <td>Tipo --- (Coche/Moto/Buggy/Atv/Camion)</td>
                    <td>
                <select name="tipo">
                    <c:choose>
                        <c:when test="${vehiculo.tipo == 'Coche'}">
                            <option value="Coche" selected>Coche</option>
                        </c:when> 

                        <c:otherwise>
                            <option value="Coche">Coche</option>
                        </c:otherwise>    
                    </c:choose>
                    <c:choose>
                        <c:when test="${vehiculo.tipo == 'Moto'}">
                            <option value="Moto" selected>Moto</option>
                        </c:when> 

                        <c:otherwise>
                            <option value="Moto">Moto</option>
                        </c:otherwise>    
                    </c:choose>
                    <c:choose>
                        <c:when test="${vehiculo.tipo == 'Buggy'}">
                            <option value="Buggy" selected>Buggy</option>
                        </c:when> 

                        <c:otherwise>
                            <option value="Buggy">Buggy</option>
                        </c:otherwise>    
                    </c:choose>
                    <c:choose>
                        <c:when test="${vehiculo.tipo == 'Atv'}">
                            <option value="Atv" selected>Atv</option>
                        </c:when> 

                        <c:otherwise>
                            <option value="Atv">Atv</option>
                        </c:otherwise>    
                    </c:choose>
                    <c:choose>
                        <c:when test="${vehiculo.tipo == 'Camion'}">
                            <option value="Camion" selected>Camion</option>
                        </c:when> 

                        <c:otherwise>
                            <option value="Camion">Camion</option>
                        </c:otherwise>    
                    </c:choose>
                </select>



                </td>
                </tr>
                <tr>
                    <td>Potencia</td>
                    <td><input type="number" name="potencia" value="${vehiculo.potencia}"/></td>
                </tr>
                <tr>
                    <td>Piloto</td>
                    <td><input type="text" name="piloto" value="${vehiculo.piloto}"/></td>
                </tr>
                <tr>
                    <td>Copiloto --- (Dejar Vacio en Caso de no Existir)</td>
                    <td><input type="text" name="copiloto" value="${vehiculo.copiloto}"/></td>
                </tr>
                <tr>
                    <td>Clasificacion</td>
                    <td><input type="number" name="clasificacion" value="${vehiculo.clasificacion}"/></td>
                </tr>
                <tr>
                    <td>Tiempo Total --- (00H-00M-00S)</td>
                    <td><input type="text" name="tiempoTotal" value="${vehiculo.tiempoTotal}"/></td>
                </tr>


            </table>
            <input type="submit" value="Aceptar" />
        </form>
    </body>
</html>
