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
public class Vehiculo {
    
    private String idVehiculo;
    private String nombreEquipo;
    private String tipo;
    private int potencia;
    private String piloto;
    private String copiloto;
    private String clasificacion;
    private String tiempoTotal;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String nombreEquipo, String tipo, int potencia, String piloto, String copiloto, String clasificacion, String tiempoTotal) {
        this.idVehiculo = idVehiculo;
        this.nombreEquipo = nombreEquipo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.clasificacion = clasificacion;
        this.tiempoTotal = tiempoTotal;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(String tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", nombreEquipo=" + nombreEquipo + ", tipo=" + tipo + ", potencia=" + potencia + ", piloto=" + piloto + ", copiloto=" + copiloto + ", clasificacion=" + clasificacion + ", tiempoTotal=" + tiempoTotal + '}';
    }

    
    
    
    
    
    
}
