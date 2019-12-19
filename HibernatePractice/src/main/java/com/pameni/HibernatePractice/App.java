package com.pameni.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Practicing hibernate
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko = new Alien();
        
//        an.setFname("gom");
//        an.setLname("lock");
//        an.setMname("hiul");
//        
//        telusko.setAid(103);
//        telusko.setAname(an);
//        telusko.setColor("gold");
      
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //session.save(telusko);
        
        telusko = (Alien) session.get(Alien.class, 102); //fetch data from database
        System.out.println(telusko);
  
        tx.commit();
        
        session.close();
        
        //creating a second session to practice L1 and L2 cache
        //L2 cache is not provide by Hibernate by default
        //you have to get it from a provider, EHcache, OScache
        Session session1 = sf.openSession();
        
        Transaction tx1 = session1.beginTransaction();
        
        telusko = (Alien) session1.get(Alien.class, 102); //fetch data from database
        System.out.println(telusko);
  
        tx1.commit();
        
        session1.close();
        
    }
}
