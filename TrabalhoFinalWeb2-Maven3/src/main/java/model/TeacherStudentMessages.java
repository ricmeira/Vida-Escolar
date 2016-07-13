/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author fzschornack
 */
@Entity
public class TeacherStudentMessages {
    
    @Id
    @GeneratedValue
    private int teac_stud_mess_sq_id;
    private String message;
    private Date date;
    @OneToOne
    private Students student;
    @OneToOne
    private Teachers teacher;

    public TeacherStudentMessages() {
    }

    public TeacherStudentMessages(String message, Date date, Students student, Teachers teacher) {
        this.message = message;
        this.date = date;
        this.student = student;
        this.teacher = teacher;
    }

    public int getTeac_stud_mess_sq_id() {
        return teac_stud_mess_sq_id;
    }

    public void setTeac_stud_mess_sq_id(int teac_stud_mess_sq_id) {
        this.teac_stud_mess_sq_id = teac_stud_mess_sq_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getMessageHint() {
        return message.substring(0, 10) + "...";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }
    
    
    
}
