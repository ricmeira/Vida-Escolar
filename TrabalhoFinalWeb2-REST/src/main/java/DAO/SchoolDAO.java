/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Schools;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo
 */
public class SchoolDAO {
    SessionGetter s = new SessionGetter();
    
    public void insert(String name){
        
        Schools school = new Schools();
        school.setSchool_nm_name(name);
        
        Session session = s.getSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(school);
        tx.commit();
        
        session.close();
    }

    public List<Schools> getAll(){
        Session session = s.getSession();
        
        Transaction t = session.beginTransaction();

        Query query = session.createQuery("from Schools");
        List<Schools> list = query.list();
        System.out.println(list);
        t.commit();
        session.close();
        
        return list;    
    }
}
