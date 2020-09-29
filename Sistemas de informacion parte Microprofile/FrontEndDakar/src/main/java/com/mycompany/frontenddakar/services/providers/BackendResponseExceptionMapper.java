/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontenddakar.services.providers;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

/**
 *
 * @author Carlos
 */
public class BackendResponseExceptionMapper implements ResponseExceptionMapper< Exception > {

    @Override
    public Exception toThrowable(Response rspns) {
        return new Exception();
    }

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> mm) {
         return ( Response.Status.INTERNAL_SERVER_ERROR.getStatusCode() == status );
    }
    
}
