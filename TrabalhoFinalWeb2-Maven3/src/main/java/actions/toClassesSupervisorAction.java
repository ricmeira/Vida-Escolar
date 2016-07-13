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
import model.ClassGrades;
import model.Schools;
import model.Subjects;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Ricardo
 */
public class toClassesSupervisorAction extends ActionSupport{
    public List<ClassGrades> sub = new ArrayList<ClassGrades>();
    public String classGradeChoosen;
    
    public String execute(){
        HTTPPost post = new HTTPPost("ClassGrades","getAll");   
        
        String gsonToParse = post.sendGet();
        System.out.println(gsonToParse);
        Type type = new TypeToken<List<ClassGrades>>(){}.getType();
        sub = new Gson().fromJson(gsonToParse, type);
        return SUCCESS; 
    }

    public List<ClassGrades> getSub() {
        return sub;
    }

    public void setSub(List<ClassGrades> sub) {
        this.sub = sub;
    }

    public String getClassGradeChoosen() {
        return classGradeChoosen;
    }

    public void setClassGradeChoosen(String classGradeChoosen) {
        this.classGradeChoosen = classGradeChoosen;
    }

    
    
}
