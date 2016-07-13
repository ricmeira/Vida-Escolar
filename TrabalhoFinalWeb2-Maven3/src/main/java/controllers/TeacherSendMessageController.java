/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.Students;
import model.TeacherStudentMessages;

/**
 *
 * @author fzschornack
 */
public class TeacherSendMessageController {
    
    private TeacherStudentMessages newMessage;
    
    private List<Students> students = new ArrayList<Students>(){{
        add(new Students("Huguinho"));
        add(new Students("Zezinho"));        
    }};
    
    public TeacherStudentMessages getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(TeacherStudentMessages newMessage) {
        this.newMessage = newMessage;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
    
    /**
     * Send message 
     * @return 
     */
    public String send() {
        //TODO: send new message
        return "";
    }
    
}
