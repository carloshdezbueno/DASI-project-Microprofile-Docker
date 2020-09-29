/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upsa.backenddakar.model;

import com.upsa.backenddakar.exceptions.AppException;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface Dao {

    public List<Resultado> selectResultados() throws AppException;

    public List<Vehiculo> selectVehiculos() throws AppException;

    public List<Etapa> selectEtapas() throws AppException;

    public Vehiculo selectVehiculo(String idVehiculo) throws AppException;

    public Etapa selectEtapa(String idEtapa) throws AppException;

    public Vehiculo deleteVehiculo(String idVehiculo) throws AppException;

    public Vehiculo insertVehiculo(String idVehiculo, String nombreEquipo, String tipo, int potencia, String piloto, String copiloto, String clasificacion, String tiempoTotal) throws AppException;
    
}
