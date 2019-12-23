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
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + aid;
	result = prime * result + ((aname == null) ? 0 : aname.hashCode());
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((laps == null) ? 0 : laps.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Alien other = (Alien) obj;
	if (aid != other.aid)
		return false;
	if (aname == null) {
		if (other.aname != null)
			return false;
	} else if (!aname.equals(other.aname))
		return false;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (laps == null) {
		if (other.laps != null)
			return false;
	} else if (!laps.equals(other.laps))
		return false;
	return true;
}

@Override
  public String toString() {
    return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + ", laps=" + laps + "]";
  }
  
}
