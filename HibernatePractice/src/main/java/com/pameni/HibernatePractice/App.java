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
        AlienName an = new AlienName();
        
        an.setFname("Yolande");
        an.setLname("Toko");
        an.setMname("Holland");
        
        telusko.setAid(101);
        telusko.setAname(an);
        telusko.setColor("purple");
      
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(telusko);
        
        //telusko = (Alien) session.get(Alien.class, 101); //fetch data from database
        
        tx.commit();
        
        System.out.println(telusko);
    }
}
