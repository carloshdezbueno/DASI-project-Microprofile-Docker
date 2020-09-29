/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.forms;

import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;

/**
 *
 * @author Carlos
 */
public class FormularioVehiculoBean {
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("idVehiculo")
    @MvcBinding
    private String idVehiculo;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("nombreEquipo")
    @MvcBinding
    private String nombreEquipo;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("tipo")
    @MvcBinding
    private String tipo;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("potencia")
    @MvcBinding
    private String potencia;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("piloto")
    @MvcBinding
    private String piloto;
    
    
    @Size(min= 0, max = 100)
    @FormParam("copiloto")
    @DefaultValue("")
    @MvcBinding
    private String copiloto;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("clasificacion")
    @MvcBinding
    private String clasificacion;
    
    @NotNull
    @NotBlank
    @Size(min= 1, max = 100)
    @FormParam("tiempoTotal")
    @MvcBinding
    private String tiempoTotal;

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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
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
    
    
}
