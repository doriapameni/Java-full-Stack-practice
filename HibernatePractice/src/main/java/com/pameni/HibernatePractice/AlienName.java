package com.pameni.HibernatePractice;

import javax.persistence.Embeddable;

/**
 * 
 * @author doria
 *annotation to use on top of a class
 *@Embeddable --> prevent the creation of this class as a new object
 *while enabling its mapping in another table as an object
 */
@Embeddable
public class AlienName {
  
  private String fname;
  
  private String lname;
  
  private String mname;

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }

  @Override
  public String toString() {
    return "AlienName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
  }
  
  

}
