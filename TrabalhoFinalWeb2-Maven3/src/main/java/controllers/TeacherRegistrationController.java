/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.Schools;
import model.Subjects;
import model.Teachers;

/**
 *
 * @author fzschornack
 */
public class TeacherRegistrationController {
    
    private Teachers teacher;
    private List<Schools> schools = new ArrayList<Schools>(){{
        add(new Schools("Escola 1"));
        add(new Schools("Escola 2"));
    }}; 
    private List<Subjects> subjects = new ArrayList<Subjects>(){{
        add(new Subjects("Português"));
        add(new Subjects("Matemática"));
    }}; 

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public List<Schools> getSchools() {
        return schools;
    }

    public void setSchools(List<Schools> schools) {
        this.schools = schools;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }
    
    /**
     * Register new teacher 
     * @return 
     */
    public String register() {
        //TODO: register new teacher
        return "";
    }
    
}
