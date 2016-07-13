/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickzcho.trabalhofinalweb2.rest;

import DAO.SupervisorDAO;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Supervisors;

/**
 * REST Web Service
 *
 * @author Ricardo
 */
@Path("supervisor")
public class SupervisorsREST {
    SupervisorDAO supDAO = new SupervisorDAO();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SupervisorsREST
     */
    public SupervisorsREST() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("insert")
    public void insert(String json) {
        Supervisors sup = new Gson().fromJson(json, Supervisors.class);
        supDAO.insert(sup);
    }
}
