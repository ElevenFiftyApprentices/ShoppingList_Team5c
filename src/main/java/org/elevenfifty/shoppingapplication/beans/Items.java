package org.elevenfifty.shoppingapplication.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public int shoppingListId;
	public String contents;
	public int priority;
	
	//use boolean to keep it checked!!!
	public boolean isChecked;
	public Date createdUtc;
	public Date modifiedUtc;
	public int getId() {
		return id;
	}
	public int getShoppingListId() {
		return shoppingListId;
	}
	public String getContents() {
		return contents;
	}
	public int getPriority() {
		return priority;
	}
	public boolean isChecked() {
		return isChecked;
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
	public void setShoppingListId(int shoppingListId) {
		this.shoppingListId = shoppingListId;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
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
		Items other = (Items) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}