package com.pameni.HibernatePractice;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 
 * @author doria
 *here are other annotations you can use
 *on the top of the class:
 *@Entity(name="blablabla") otherwise your class name will be use as the table name
 *@Table(name="blablabla") if you dont want to change the entity name but only the table
 *
 *on the top of a variable
 *@Column(name="blablabla")
 *@Transient if you don't want a variable to be stored
 *
 *@Cacheable
 *@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
 *use both ate the same time if you want to enable L2 caching
 */
@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
  
  @Id
  private int aid;
  
  private AlienName aname;

  private String color;

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public AlienName getAname() {
    return aname;
  }

  public void setAname(AlienName aname) {
    this.aname = aname;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
  }

}
