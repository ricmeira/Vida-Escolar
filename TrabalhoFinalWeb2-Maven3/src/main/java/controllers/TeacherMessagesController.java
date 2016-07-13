/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Students;
import model.TeacherStudentMessages;
import model.Teachers;

/**
 *
 * @author fzschornack
 */
public class TeacherMessagesController {
    
    private List<TeacherStudentMessages> teacherStudentMessages = new ArrayList<TeacherStudentMessages>(){{
        add(new TeacherStudentMessages("Content1 bla bla bla", new Date(),new Students("Huguinho"), new Teachers("Girafales")));
        add(new TeacherStudentMessages("Content2 bla bla bla",new Date(),new Students("Zezinho"),new Teachers("Girafales")));        
    }};

    public List<TeacherStudentMessages> getTeacherStudentMessages() {
        return teacherStudentMessages;
    }

    public void setTeacherStudentMessages(List<TeacherStudentMessages> teacherStudentMessages) {
        this.teacherStudentMessages = teacherStudentMessages;
    }    
    
}
