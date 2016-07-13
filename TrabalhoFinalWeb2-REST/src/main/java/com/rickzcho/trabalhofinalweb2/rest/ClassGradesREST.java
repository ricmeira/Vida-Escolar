/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rickzcho.trabalhofinalweb2.rest;

import DAO.ClassGradesDAO;
import DAO.SubjectDAO;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.ClassGrades;

/**
 * REST Web Service
 *
 * @author Ricardo
 */
@Path("ClassGrades")
public class ClassGradesREST {
    ClassGradesDAO dh = new ClassGradesDAO();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SubjectREST
     */
    public ClassGradesREST() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAll")
    public String getAll() {
        List<ClassGrades> sub = dh.getAll();

        Gson gson = new Gson();
        String answer = gson.toJson(sub);

        return answer;
    }
}
