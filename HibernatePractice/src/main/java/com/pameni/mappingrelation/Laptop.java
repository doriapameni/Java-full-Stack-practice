package com.pameni.mappingrelation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
  
  @Id
  private int lid;
  
  private String lname;
  
  @ManyToOne
  private Student student;
  
  @ManyToMany
  private List <Student> people = new ArrayList <Student>();
  
  public Laptop() {
    super();
  }

  public Laptop(int lid, String lname, Student student, List<Student> people) {
    super();
    this.lid = lid;
    this.lname = lname;
    this.student = student;
    this.people = people;
  }

  public List<Student> getPeople() {
    return people;
  }

  public void setPeople(List<Student> people) {
    this.people = people;
  }

  public int getLid() {
    return lid;
  }

  public void setLid(int lid) {
    this.lid = lid;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

}
