/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import HTTP.HTTPPost;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Ricardo
 */
public class LoginParentAction extends ActionSupport{

    String CPF, Senha,name,email,address,number,student,cep,birthday;

     
    public String execute() throws Exception {
       return SUCCESS; 
    }
    
    //Modificar
    public String login() throws Exception {
        if(CPF.equals(Senha)){
            HttpServletRequest request = ServletActionContext.getRequest();
            
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            session.setMaxInactiveInterval(60*10);
            
            return SUCCESS;
        }
        else{
            return ERROR;
        }        
    }
    
    public String register() throws Exception {
        return SUCCESS; 
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    
}
