/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fzschornack
 */
public class Teachers {
    
    private int teacher_sq_id;
    private String teacher_cd_email;
    private String teacher_nm_name;
    private String teacher_cd_password;
    private String teacher_cd_cpf;
    private Subjects subject;
    private Schools school;
    private Set<Classes> classes = new HashSet<Classes>();

    public Teachers() {
    }

    public Teachers(String teacher_nm_name) {
        this.teacher_nm_name = teacher_nm_name;
    }
    
    public int getTeacher_sq_id() {
        return teacher_sq_id;
    }

    public void setTeacher_sq_id(int teacher_sq_id) {
        this.teacher_sq_id = teacher_sq_id;
    }

    public String getTeacher_cd_email() {
        return teacher_cd_email;
    }

    public void setTeacher_cd_email(String teacher_cd_email) {
        this.teacher_cd_email = teacher_cd_email;
    }

    public String getTeacher_nm_name() {
        return teacher_nm_name;
    }

    public void setTeacher_nm_name(String teacher_nm_name) {
        this.teacher_nm_name = teacher_nm_name;
    }

    public String getTeacher_cd_password() {
        return teacher_cd_password;
    }

    public void setTeacher_cd_password(String teacher_cd_password) {
        this.teacher_cd_password = teacher_cd_password;
    }

    public String getTeacher_cd_cpf() {
        return teacher_cd_cpf;
    }

    public void setTeacher_cd_cpf(String teacher_cd_cpf) {
        this.teacher_cd_cpf = teacher_cd_cpf;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Schools getSchool() {
        return school;
    }

    public void setSchool(Schools school) {
        this.school = school;
    }

    public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }
    
    
}
