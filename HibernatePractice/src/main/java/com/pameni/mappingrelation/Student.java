package com.pameni.mappingrelation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
  
  @Id
  private int rollno;
  
  private String name;
  
  private int marks;
  
  @OneToOne
  private Laptop laptop;
  
  @OneToMany(mappedBy="student")
  private List <Laptop> laptops = new ArrayList<Laptop>();

  public Student() {
    super();
  }

  public Student(int rollno, String name, int marks, Laptop laptop, List<Laptop> laptops) {
    super();
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
    this.laptop = laptop;
    this.laptops = laptops;
  }

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public List<Laptop> getLaptops() {
    return laptops;
  }

  public void setLaptops(List<Laptop> laptops) {
    this.laptops = laptops;
  }

}
