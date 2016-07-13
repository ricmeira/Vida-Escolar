/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fzschornack
 */
@Entity
public class Classes {
    
    @Id
    @GeneratedValue
    private int class_sq_id;
    private String class_nm_name;
    @OneToOne(mappedBy = "class_grades")
    private ClassGrades grade;
    @OneToOne
    private Schools school;
    @ManyToMany(mappedBy="classes")
    private Set<Teachers> teachers = new HashSet<Teachers>();

    public Classes() {
    }

    public Classes(String class_nm_name, ClassGrades grade) {
        this.class_nm_name = class_nm_name;
        this.grade = grade;
    }
    
    public Set<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teachers> teachers) {
        this.teachers = teachers;
    }
    
    public int getClass_sq_id() {
        return class_sq_id;
    }

    public void setClass_sq_id(int class_sq_id) {
        this.class_sq_id = class_sq_id;
    }

    public String getClass_nm_name() {
        return class_nm_name;
    }

    public void setClass_nm_name(String class_nm_name) {
        this.class_nm_name = class_nm_name;
    }

    public ClassGrades getGrade() {
        return grade;
    }

    public void setGrade(ClassGrades grade) {
        this.grade = grade;
    }

    public Schools getSchool() {
        return school;
    }

    public void setSchool(Schools school) {
        this.school = school;
    }
    
    
}
