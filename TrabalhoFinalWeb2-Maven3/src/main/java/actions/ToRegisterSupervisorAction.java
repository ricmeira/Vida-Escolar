/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import HTTP.HTTPPost;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import model.Schools;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ToRegisterSupervisorAction  extends ActionSupport{
    public List<Schools> sch = new ArrayList<Schools>();
    public String schoolChoosen;
    
    public String execute() throws Exception {
        HTTPPost post = new HTTPPost("school","getAll");
        String gsonToParse = post.sendGet();
        
        Type type = new TypeToken<List<Schools>>(){}.getType();
        sch = new Gson().fromJson(gsonToParse, type);
        
        return SUCCESS; 
    } 

    public List<Schools> getSch() {
        return sch;
    }

    public void setSch(List<Schools> sch) {
        this.sch = sch;
    }

    public String getSchoolChoosen() {
        return schoolChoosen;
    }

    public void setSchoolChoosen(String schoolChoosen) {
        this.schoolChoosen = schoolChoosen;
    }
    
    
}
