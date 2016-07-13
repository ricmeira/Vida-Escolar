/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author fzschornack
 */
@Entity
public class Students {
    
    @Id
    @GeneratedValue
    private int stud_sq_id;
    private String stud_nm_name;
    private Date stud_dt_birthdate;
    private String stud_cd_matricula;
    @OneToOne
    private Parents parent;
    @OneToOne
    private Schools school;
    @OneToOne
    private Classes studentClass;

    public int getStud_sq_id() {
        return stud_sq_id;
    }

    public void setStud_sq_id(int stud_sq_id) {
        this.stud_sq_id = stud_sq_id;
    }

    public String getStud_nm_name() {
        return stud_nm_name;
    }

    public void setStud_nm_name(String stud_nm_name) {
        this.stud_nm_name = stud_nm_name;
    }

    public Date getStud_dt_birthdate() {
        return stud_dt_birthdate;
    }

    public void setStud_dt_birthdate(Date stud_dt_birthdate) {
        this.stud_dt_birthdate = stud_dt_birthdate;
    }

    public String getStud_cd_matricula() {
        return stud_cd_matricula;
    }

    public void setStud_cd_matricula(String stud_cd_matricula) {
        this.stud_cd_matricula = stud_cd_matricula;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public Schools getSchool() {
        return school;
    }

    public void setSchool(Schools school) {
        this.school = school;
    }

    public Classes getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Classes studentClass) {
        this.studentClass = studentClass;
    }
    
    
    
}
