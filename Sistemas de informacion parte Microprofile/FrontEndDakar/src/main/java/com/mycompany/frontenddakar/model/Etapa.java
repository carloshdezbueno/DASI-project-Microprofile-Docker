/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.model;

import java.sql.Date;

/**
 *
 * @author albertogarciacampo
 */
public class Etapa {
    private String idEtapa;
    private String fecha;
    private int recorrido;

    public Etapa() {
    }

    public Etapa(String idEtapa, String fecha, int recorrido) {
        this.idEtapa = idEtapa;
        this.fecha = fecha;
        this.recorrido = recorrido;
    }

    public String getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(String idEtapa) {
        this.idEtapa = idEtapa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Etapa{" + "idEtapa=" + idEtapa + ", fecha=" + fecha + ", recorrido=" + recorrido + '}';
    }

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }
    
    
}
