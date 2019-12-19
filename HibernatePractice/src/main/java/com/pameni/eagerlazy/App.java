package com.pameni.eagerlazy;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Practicing fetch Eager and lazy
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
//        Laptop lap = new Laptop();
//        Collection<Laptop> laps = new ArrayList<Laptop>();
//        lap = session.get(Laptop.class, 1);
//        laps.add(lap);
//        lap = session.get(Laptop.class, 2);
//        laps.add(lap);
//        lap = session.get(Laptop.class, 3);
//        laps.add(lap);
//        Alien telusko = new Alien(3, "Roberto", "Grey", laps);
//        session.save(telusko);
        Alien telusko = new Alien();
        telusko = (Alien) session.get(Alien.class, 3); 
        System.out.println(telusko.getAname());
        
//        Collection<Laptop> laps = telusko.getLaps();
//        for(Laptop l : laps) {
//          System.out.println(l);
//        }
        
        tx.commit();
        
        
    }
}
