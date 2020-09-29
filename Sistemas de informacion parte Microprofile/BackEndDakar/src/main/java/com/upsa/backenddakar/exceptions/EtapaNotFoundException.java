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
public class EtapaNotFoundException extends AppException{
    private String idEtapa;

    public EtapaNotFoundException(String idEtapa)
    {
        super( String.format("No existe la etapa con id %s", idEtapa) );
        this.idEtapa = idEtapa;
    }

    public String getIdEtapa() {
        return idEtapa;
    }

     
    
}
