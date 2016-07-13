/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import HTTP.HTTPPost;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.lang.reflect.Type;
import java.util.List;
import model.Schools;
import model.Supervisors;

/**
 *
 * @author Ricardo
 */
public class LoginSupervisorAction extends ActionSupport{
    public String schoolChoosen,name,CPF,Senha,email;
    
    public String register() throws Exception {
        HTTPPost post = new HTTPPost("supervisor","insert");
        Supervisors sup = new Supervisors();
        sup.setSuper_cd_cpf(CPF);
        sup.setSuper_cd_email(email);
        sup.setSuper_cd_password(Senha);
        sup.setSuper_nm_name(name);
        
        Schools sc = new Schools();
        sc.setSchool_sq_id(Integer.parseInt(schoolChoosen));
        sup.setSchool_sq_id(sc);
        
        String json = new Gson().toJson(sup);

        post.sendPost(json);
        
        return SUCCESS; 
    } 

    public String getSchoolChoosen() {
        return schoolChoosen;
    }

    public void setSchoolChoosen(String schoolChoosen) {
        this.schoolChoosen = schoolChoosen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
