package com.mycompany.frontenddakar.resources;

import com.mycompany.frontenddakar.forms.FormularioVehiculoBean;
import com.mycompany.frontenddakar.model.Dao;
import com.mycompany.frontenddakar.model.Etapa;
import com.mycompany.frontenddakar.model.Resultado;
import com.mycompany.frontenddakar.model.Vehiculo;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author albertogarciacampo
 */
@Path("/dakar")
public class DakarResource {

    @Inject
    private Dao dao;

    @Inject
    private Models models;

    @Inject
    private BindingResult bindingResult;
    
    @GET
    @Controller
    @Path("")
    @View("/jsps/index.jsp")
    public void index() {
    }

    @GET
    @Controller
    @Path("/resultados")
    @View("/jsps/resultados.jsp")
    public void requestResultados() {
        List<Resultado> resultados = dao.requestResultados();
        
        models.put("resultados", resultados);

    }

    @GET
    @Path("etapas")
    @Controller
    @View("/jsps/etapas.jsp")
    public void requestEtapas() {

        List<Etapa> etapas = dao.requestEtapas();

        models.put("etapas", etapas);

    }

    @GET
    @Path("etapas/{idEtapa}")
    @Controller
    @View("/jsps/etapa.jsp")
    public void requestEtapa(@PathParam("idEtapa") String idEtapa) {
        
        Etapa etapa = dao.requestEtapa(idEtapa);
        
        models.put("etapa", etapa);
    }

    @GET
    @Path("vehiculos")
    @Controller
    @View("/jsps/vehiculos.jsp")
    public void requestVehiculos() {

        List<Vehiculo> vehiculos = dao.requestVehiculos();

        models.put("vehiculos", vehiculos);

    }

    @GET
    @Path("vehiculos/{idVehiculo}")
    @Controller
    @View("/jsps/vehiculo.jsp")
    public void requestVehiculo(@PathParam("idVehiculo") String idVehiculo) {
        
        Vehiculo vehiculo = dao.requestVehiculo(idVehiculo);
        
        models.put("vehiculo", vehiculo);
        
        
    }

    @GET
    @Path("vehiculos/insertarVehiculo")
    @Controller
    @View("/jsps/formInsertarVehiculo.jsp")
    public void formVehiculo() {
        
    }
    
    @POST
    @Path("vehiculos")
    @Controller
    public String requestInsertVehiculo(@Valid @BeanParam FormularioVehiculoBean fvb) {
        
        if ( bindingResult.isFailed() )
        {
            models.put("errores", bindingResult.getAllMessages());
            models.put("vehiculo", fvb);
            return "/jsps/formInsertarVehiculo.jsp";            
        }
        
        //En caso de que el tipo de vehiculo sea moto no puede haber copiloto
        if(fvb.getTipo().equals("Moto")){
            fvb.setCopiloto("");
        }
        
        Optional<String> optVehiculo = dao.postVehiculo(fvb.getIdVehiculo(), fvb.getNombreEquipo(), fvb.getTipo(), fvb.getPotencia(), fvb.getPiloto(), fvb.getCopiloto(), fvb.getClasificacion(), fvb.getTiempoTotal());
        
        return "redirect:/dakar/vehiculos";
        
    }

    @GET
    @Path("vehiculos/del/{idVehiculo}")
    @Controller
    public String requestDeleteVehiculo(@PathParam("idVehiculo") String idVehiculo) {
        dao.deleteVehiculo(idVehiculo);
        return "redirect:/dakar/vehiculos";
    }

}
