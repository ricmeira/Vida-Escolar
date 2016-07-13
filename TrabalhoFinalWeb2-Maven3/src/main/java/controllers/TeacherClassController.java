/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd.jsf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fzschornack
 */
public class TeacherClassController {
    private Class newClass;
    private List<Class> teacherClasses = new ArrayList<Class>(){{
        add(new Class("Turma 1","1a Série"));
        add(new Class("Turma 2","1a Série"));
    }};
    
    private List<Class> classes = new ArrayList<Class>(){{
        add(new Class("Turma 1","1a Série"));
        add(new Class("Turma 2","1a Série"));
        add(new Class("Turma 1","2a Série"));
        add(new Class("Turma 1","3a Série"));
        add(new Class("Turma 1","4a Série"));
    }};

    public Class getNewClass() {
        return newClass;
    }

    public void setNewClass(Class newClass) {
        this.newClass = newClass;
    }

    public List<Class> getTeacherClasses() {
        return teacherClasses;
    }

    public void setTeacherClasses(List<Class> teacherClasses) {
        this.teacherClasses = teacherClasses;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
    
    
    
}
