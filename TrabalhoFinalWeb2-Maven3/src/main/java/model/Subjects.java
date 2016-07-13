/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author fzschornack
 */
@Entity
public class Subjects {
   
    @Id
    @GeneratedValue
    private int subject_sq_id;
    private String subject_nm_name;

    public Subjects() {
    }

    public Subjects(String subject_nm_name) {
        this.subject_nm_name = subject_nm_name;
    }

    public int getSubject_sq_id() {
        return subject_sq_id;
    }

    public void setSubject_sq_id(int subject_sq_id) {
        this.subject_sq_id = subject_sq_id;
    }

    public String getSubject_nm_name() {
        return subject_nm_name;
    }

    public void setSubject_nm_name(String subject_nm_name) {
        this.subject_nm_name = subject_nm_name;
    }
    
    
}
