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
 * @author Ricardo
 */

@Entity
public class Schools {
    
    @Id
    @GeneratedValue
    int school_sq_id;
    String school_nm_name;

    public int getSchool_sq_id() {
        return school_sq_id;
    }

    public void setSchool_sq_id(int school_sq_id) {
        this.school_sq_id = school_sq_id;
    }

    public String getSchool_nm_name() {
        return school_nm_name;
    }

    public void setSchool_nm_name(String school_nm_name) {
        this.school_nm_name = school_nm_name;
    }
    
    
}
