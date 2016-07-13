/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.ClassGrades;
import model.Subjects;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo
 */
public class ClassGradesDAO {
    SessionGetter s = new SessionGetter();
        
    public List<ClassGrades> getAll(){
        Session session = s.getSession();
        
        Transaction t = session.beginTransaction();

        Query query = session.createQuery("from ClassGrades");
        List<ClassGrades> list = query.list();
        System.out.println(list);
        t.commit();
        session.close();
        
        return list;    
    }
}
