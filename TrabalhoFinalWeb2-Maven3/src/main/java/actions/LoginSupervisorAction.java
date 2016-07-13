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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Schools;
import model.Supervisors;
import org.apache.struts2.ServletActionContext;

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

    public String login(){
        List<String> params = new ArrayList<String>();
        params.add(CPF);
        params.add(Senha);
        HTTPPost post = new HTTPPost("supervisor","login",params);
        Supervisors sup = new Supervisors();
        sup.setSuper_cd_cpf(CPF);        
        sup.setSuper_cd_password(Senha);
        
        String json = new Gson().toJson(sup);

        String response = post.sendGet();
        if(response.equals("true")){
            HttpServletRequest request = ServletActionContext.getRequest();
            
            HttpSession session = request.getSession();
            session.setAttribute("cpf", CPF);
            session.setAttribute("type","supervisor");
            session.setMaxInactiveInterval(60*10);
            
            return SUCCESS; 
        }
        else{            
            return ERROR;       
        }
    }
    
    public String logout(){
  
        HttpServletRequest request = ServletActionContext.getRequest();
            
        HttpSession session = request.getSession();
        session.invalidate();
            
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
