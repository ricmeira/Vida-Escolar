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
public class ClassGrades {
    
    @Id
    @GeneratedValue
    private int clgr_sq_id;
    private String clgr_nm_name;

    public ClassGrades(String clgr_nm_name) {
        this.clgr_nm_name = clgr_nm_name;
    }
    
    public int getClgr_sq_id() {
        return clgr_sq_id;
    }

    public void setClgr_sq_id(int clgr_sq_id) {
        this.clgr_sq_id = clgr_sq_id;
    }

    public String getClgr_nm_name() {
        return clgr_nm_name;
    }

    public void setClgr_nm_name(String clgr_nm_name) {
        this.clgr_nm_name = clgr_nm_name;
    }
    
    
}
