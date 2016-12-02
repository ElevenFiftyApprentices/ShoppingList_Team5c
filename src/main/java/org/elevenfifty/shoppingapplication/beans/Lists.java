package org.elevenfifty.shoppingapplication.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lists")
public class Lists {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	
	public int userId;
	public String name;
	public String color;
	public Date createdUtc;
	public Date modifiedUtc;
	
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public Date getCreatedUtc() {
		return createdUtc;
	}
	public Date getModifiedUtc() {
		return modifiedUtc;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCreatedUtc(Date createdUtc) {
		this.createdUtc = createdUtc;
	}
	public void setModifiedUtc(Date modifiedUtc) {
		this.modifiedUtc = modifiedUtc;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Lists other = (Lists) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
