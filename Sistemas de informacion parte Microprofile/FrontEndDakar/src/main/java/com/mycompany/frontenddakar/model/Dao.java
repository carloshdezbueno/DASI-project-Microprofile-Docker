/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.model;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author albertogarciacampo
 */
public interface Dao {
    
    public List<Resultado> requestResultados();
    public List<Vehiculo> requestVehiculos();
    public List<Etapa> requestEtapas();
    
    
    public Vehiculo requestVehiculo(String idVehiculo);
    public Etapa requestEtapa(String idEtapa);
   
    public Optional<String> postVehiculo(String idVehiculo, String nombreEquipo, String tipo, String potencia, String piloto, String copiloto, String clasificacion, String tiempoTotal);
    public void deleteVehiculo(String idVehiculo);

    
  
}
