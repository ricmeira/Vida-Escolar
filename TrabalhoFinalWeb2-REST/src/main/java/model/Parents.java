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
public class Parents {
    @Id
    @GeneratedValue
    private int parent_sq_id;
    private String parent_nm_name;
    private String parent_cd_password;
    private String parent_cd_cpf;
    private String parent_cd_email;

    public int getParent_sq_id() {
        return parent_sq_id;
    }

    public void setParent_sq_id(int parent_sq_id) {
        this.parent_sq_id = parent_sq_id;
    }

    public String getParent_nm_name() {
        return parent_nm_name;
    }

    public void setParent_nm_name(String parent_nm_name) {
        this.parent_nm_name = parent_nm_name;
    }

    public String getParent_cd_password() {
        return parent_cd_password;
    }

    public void setParent_cd_password(String parent_cd_password) {
        this.parent_cd_password = parent_cd_password;
    }

    public String getParent_cd_cpf() {
        return parent_cd_cpf;
    }

    public void setParent_cd_cpf(String parent_cd_cpf) {
        this.parent_cd_cpf = parent_cd_cpf;
    }

    public String getParent_cd_email() {
        return parent_cd_email;
    }

    public void setParent_cd_email(String parent_cd_email) {
        this.parent_cd_email = parent_cd_email;
    }
    
    
    
}
