/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Schools;
import model.Supervisors;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo
 */
public class SupervisorDAO {
    SessionGetter s = new SessionGetter();
    
    public void insert(Supervisors sup){
 
        Session session = s.getSession();

        Transaction tx = session.beginTransaction();

        session.save(sup);
        tx.commit();

        session.close();

    } 
    
    public boolean login(String cpf, String password){
        Session session = s.getSession();

        Query query = session.createQuery("from Supervisors where super_cd_cpf = :id and super_cd_password = :pass");
        query.setParameter("id", cpf);
        query.setParameter("pass", password);
                
        List<?> list = query.list();
        
        session.close();
        if(list.size() > 0){
            System.out.println("Found Super");
            Supervisors user =(Supervisors)list.get(0);
            return true;
        }
        else{
            System.out.println("Not Found Super");
            return false;
        }
    }
}
