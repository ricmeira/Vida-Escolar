/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.ClassGrades;
import model.Classes;

/**
 *
 * @author fzschornack
 */
public class TeacherClassController {
    private Class newClass;
    private List<Classes> teacherClasses = new ArrayList<Classes>(){{
        add(new Classes("Turma 1",new ClassGrades("1a Série")));
    }};
    
    private List<Classes> classes = new ArrayList<Classes>(){{
        add(new Classes("Turma 2",new ClassGrades("2a Série")));
    }};

    public Class getNewClass() {
        return newClass;
    }

    public void setNewClass(Class newClass) {
        this.newClass = newClass;
    }

    public List<Classes> getTeacherClasses() {
        return teacherClasses;
    }

    public void setTeacherClasses(List<Classes> teacherClasses) {
        this.teacherClasses = teacherClasses;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }
    
    
    
}
