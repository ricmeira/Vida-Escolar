/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickzcho.trabalhofinalweb2.rest;

import DAO.SchoolDAO;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Schools;

/**
 * REST Web Service
 *
 * @author Ricardo
 */
@Path("school")
public class SchoolsREST {
    SchoolDAO dh = new SchoolDAO();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SchoolREST
     */
    public SchoolsREST() {
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAll")
    public String getAll() {
        List<Schools> schools = dh.getAll();

        Gson gson = new Gson();
        String answer = gson.toJson(schools);

        return answer;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getOne/{login}/{password}")
    public String getOne(@PathParam("login") String login, @PathParam("password") String password) {
        return "<teste>"+login+"</teste>";
    }

    /**
     * PosT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @GET
    //@Consumes(MediaType.APPLICATION_XML)
    @Path("insert")
    public void insert() {
        dh.insert("teste");
    }
    
    
}
