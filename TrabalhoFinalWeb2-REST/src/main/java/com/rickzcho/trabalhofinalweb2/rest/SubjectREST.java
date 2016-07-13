/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickzcho.trabalhofinalweb2.rest;

import DAO.SchoolDAO;
import DAO.SubjectDAO;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Schools;
import model.Subjects;

/**
 * REST Web Service
 *
 * @author Ricardo
 */
@Path("subject")
public class SubjectREST {
    SubjectDAO dh = new SubjectDAO();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SubjectREST
     */
    public SubjectREST() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAll")
    public String getAll() {
        List<Subjects> sub = dh.getAll();

        Gson gson = new Gson();
        String answer = gson.toJson(sub);

        return answer;
    }
}
