/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upsa.backenddakar.exceptions;

/**
 *
 * @author Carlos
 */
public class VehiculoNotFoundException extends AppException{
    private String idVehiculo;

    public VehiculoNotFoundException(String idVehiculo)
    {
        super( String.format("No existe el vehiculo con id %s", idVehiculo) );
        this.idVehiculo = idVehiculo;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }
    
    
}
