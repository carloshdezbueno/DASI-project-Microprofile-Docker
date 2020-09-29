/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.model.impl;

import com.mycompany.frontenddakar.model.Dao;
import com.mycompany.frontenddakar.model.Etapa;
import com.mycompany.frontenddakar.model.Resultado;
import com.mycompany.frontenddakar.model.Vehiculo;
import com.mycompany.frontenddakar.services.BackendService;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 * @author albertogarciacampo
 */
public class RestClientDao implements Dao{


    @Inject
    @RestClient 
    private BackendService backend;

 
    

    @Override
    public List<Resultado> requestResultados() {
        return backend.selectResultados();
    }
    
    
    @Override
    public List<Etapa> requestEtapas() {
        return backend.selectEtapas();
    }


    @Override
    public Etapa requestEtapa(String idEtapa) {
        Response response = backend.selectEtapa(idEtapa);
        
        switch ( response.getStatus() )
        {
            case 200 : return response.readEntity( Etapa.class );
            
            default  : return null; 
        }
    }
    
    
     @Override
    public List<Vehiculo> requestVehiculos(){
        return backend.selectVehiculos();
    }

    
     @Override
    public Vehiculo requestVehiculo(String idVehiculo) {
        Response response = backend.selectVehiculo(idVehiculo);
        
        switch ( response.getStatus() )
        {
            case 200 : return response.readEntity( Vehiculo.class );
            
            default  : return null; 
        }
    }

    @Override
    public Optional<String> postVehiculo(String idVehiculo, String nombreEquipo, String tipo, String potencia, String piloto, String copiloto, String clasificacion, String tiempoTotal)
    {
        Form form = new Form();
        form.param("idVehiculo", idVehiculo);
        form.param("nombreEquipo", nombreEquipo);
        form.param("tipo", tipo);
        form.param("potencia", potencia);
        form.param("piloto", piloto);
        form.param("copiloto", copiloto);
        form.param("clasificacion", clasificacion);
        form.param("tiempoTotal", tiempoTotal); 
        
        
        Response response = backend.requestInsertVehiculo(form);
        
        
        switch ( response.getStatus() )
        {
            case 201: String location = response.getHeaderString("Location");
                      return Optional.of(location);
                      
            default:  return Optional.empty();
        }
    }

    

    @Override
    public void deleteVehiculo(String idVehiculo) {
        Response response = backend.deleteVehiculo(idVehiculo);
        
        switch ( response.getStatus() )
        {
            case 204 : 
                return;
                        
            default:   
                return;
        }
               
    }

   

    
    
}
