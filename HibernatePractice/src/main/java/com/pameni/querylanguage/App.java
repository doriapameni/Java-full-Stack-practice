package com.pameni.querylanguage;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

  public static void main(String[] args) {
    Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    
    SessionFactory sf = con.buildSessionFactory();
    
    Session session = sf.openSession();
    
    Transaction tx = session.beginTransaction();
    
    Random r = new Random();
    
//    for (int i=1; i <=50; i++)
//    {
//    Student s = new Student();
//    s.setRollno(i);
//    s.setName("student"+ i);
//    s.setMarks(r.nextInt(100));
//    session.save(s);
//    }
    
    //Query q = session.createQuery("from Student");
    Query q = session.createQuery("from Student where marks > 50");
    List <Student> students = q.list();
    for(Student s: students) {
      System.out.println(s);
    }

    tx.commit();
    
    session.close();

  }

}
