/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.services;

import com.mycompany.frontenddakar.model.Etapa;
import com.mycompany.frontenddakar.model.Resultado;
import com.mycompany.frontenddakar.model.Vehiculo;
import com.mycompany.frontenddakar.services.providers.BackendResponseExceptionMapper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author Carlos
 */
@RegisterRestClient
@RegisterProvider(BackendResponseExceptionMapper.class)
public interface BackendService {
    @Path("/dakar/resultados")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Resultado> selectResultados();

    //Parte para ver vehiculos y vehiculo individual
    @Path("/dakar/vehiculos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vehiculo> selectVehiculos();

    @Path("/dakar/vehiculos/{idVehiculo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectVehiculo(@PathParam("idVehiculo") String idVehiculo);

    //Parte para ver etapas y etapa individual
    @Path("/dakar/etapas")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Etapa> selectEtapas();

    @Path("/dakar/etapas/{idEtapa}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectEtapa(@PathParam("idEtapa") String idEtapa);

    @Path("/dakar/vehiculos/{idVehiculo}")
    @DELETE
    public Response deleteVehiculo(@PathParam("idVehiculo") String idVehiculo);

    @POST
    @Path("/dakar/vehiculos")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response requestInsertVehiculo(Form form);
}
