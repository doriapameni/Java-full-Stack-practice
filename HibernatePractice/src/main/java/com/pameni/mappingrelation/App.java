package com.pameni.mappingrelation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

  public static void main(String[] args) {
    
    Laptop laptop = new Laptop();
    laptop.setLid(101);
    laptop.setLname("Dell");
    
    List <Laptop> desktop = new ArrayList<Laptop>();
    desktop.add(laptop);
    
    Student s = new Student();
    s.setName("Navin");
    s.setRollno(1);
    s.setMarks(50);
    s.setLaptop(laptop);
    s.setLaptops(desktop);
    List <Student> peop = new ArrayList<Student>();
    peop.add(s);
    
    laptop.setPeople(peop);
    s.setLaptops(desktop);
  
    Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    
    SessionFactory sf = con.buildSessionFactory();
    
    Session session = sf.openSession();
    
    Transaction tx = session.beginTransaction();
    
    session.save(laptop);
    session.save(s);
   
    tx.commit();
    
    session.close();

  }

}
