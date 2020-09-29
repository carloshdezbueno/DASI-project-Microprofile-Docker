/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upsa.backenddakar.model;

/**
 *
 * @author Carlos
 */
public class Resultado {
    private String idResultado;
    private Etapa etapa;
    private Vehiculo vehiculo;
    private String tiempo;

    public Resultado() {
    }

    public Resultado(String idResultado, Etapa etapa, Vehiculo vehiculo, String tiempo) {
        this.idResultado = idResultado;
        this.etapa = etapa;
        this.vehiculo = vehiculo;
        this.tiempo = tiempo;
    }

    public String getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(String idResultado) {
        this.idResultado = idResultado;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Resultado{" + "idResultado=" + idResultado + ", etapa=" + etapa + ", vehiculo=" + vehiculo + ", recorrido=" + tiempo + '}';
    }
    
    
}
