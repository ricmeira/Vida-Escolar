/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Schools;
import model.Supervisors;
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
}
