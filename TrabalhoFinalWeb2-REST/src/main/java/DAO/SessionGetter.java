/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author fzschornack
 */
public class SessionGetter {
    
   private static SessionFactory sessionFactory = buildSessionFactory();
 
   private static SessionFactory buildSessionFactory() {
      try {
         if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure();
            
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
        
            sessionFactory = configuration.buildSessionFactory(standardRegistry);          
         }
         return sessionFactory;
      } catch (Exception ex) {
         throw new ExceptionInInitializerError(ex);
      }
   }
   
   public static Session getSession() {
      return sessionFactory.openSession();
   }
 
   public static void shutdown() {
      getSession().close();
   }
    
}


/*/**
 *
 * @author Ricardo
 */
/*public class SessionGetter {
    SessionFactory sessionFactory;
    
    public SessionGetter(){
        Configuration configuration= new Configuration();       
        configuration.configure();   
        
        StandardServiceRegistry standardRegistry= new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
        sessionFactory = configuration.buildSessionFactory(standardRegistry);  
    }
    
    public org.hibernate.Session getSession(){
   
        org.hibernate.Session session = sessionFactory.openSession();
        
        return session;
    }
}*/
