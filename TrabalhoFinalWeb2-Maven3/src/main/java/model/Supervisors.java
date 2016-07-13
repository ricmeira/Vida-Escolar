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
public class Supervisors {
    @Id
    @GeneratedValue
    int super_sq_id;
    public String super_nm_name, super_cd_email, super_cd_cpf, super_cd_password;
    Schools school_sq_id;

    public int getSuper_sq_id() {
        return super_sq_id;
    }

    public void setSuper_sq_id(int super_sq_id) {
        this.super_sq_id = super_sq_id;
    }

    public String getSuper_nm_name() {
        return super_nm_name;
    }

    public void setSuper_nm_name(String super_nm_name) {
        this.super_nm_name = super_nm_name;
    }

    public String getSuper_cd_email() {
        return super_cd_email;
    }

    public void setSuper_cd_email(String super_cd_email) {
        this.super_cd_email = super_cd_email;
    }

    public String getSuper_cd_cpf() {
        return super_cd_cpf;
    }

    public void setSuper_cd_cpf(String super_cd_cpf) {
        this.super_cd_cpf = super_cd_cpf;
    }

    public String getSuper_cd_password() {
        return super_cd_password;
    }

    public void setSuper_cd_password(String super_cd_password) {
        this.super_cd_password = super_cd_password;
    }

    public Schools getSchool_sq_id() {
        return school_sq_id;
    }

    public void setSchool_sq_id(Schools school_sq_id) {
        this.school_sq_id = school_sq_id;
    }
    
    
}
