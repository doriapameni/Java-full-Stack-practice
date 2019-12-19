package com.pameni.eagerlazy;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 */
@Entity
public class Alien {
  
  @Id
  private int aid;
  
  private String aname;

  private String color;
  
  //the default fetch type is lazy
  //@OneToMany(mappedBy="alien", fetch=FetchType.EAGER)
  //will do eager fetch for you
  @OneToMany(mappedBy="alien", fetch=FetchType.EAGER)
  private Collection<Laptop> laps = new ArrayList<Laptop>();

  public Alien() {
    super();
  }

  public Alien(int aid, String aname, String color, Collection<Laptop> laps) {
    super();
    this.aid = aid;
    this.aname = aname;
    this.color = color;
    this.laps = laps;
  }

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Collection<Laptop> getLaps() {
    return laps;
  }

  public void setLaps(Collection<Laptop> laps) {
    this.laps = laps;
  }

  @Override
  public String toString() {
    return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + ", laps=" + laps + "]";
  }
  
}
