package org.elevenfifty.shoppingapplication.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public int shoppingListItemId;
	public String body;
	public Date createdUtc;
	public Date modifiedUtc;
	public int getId() {
		return id;
	}
	public int getShoppingListItemId() {
		return shoppingListItemId;
	}
	public String getBody() {
		return body;
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
	public void setShoppingListItemId(int shoppingListItemId) {
		this.shoppingListItemId = shoppingListItemId;
	}
	public void setBody(String body) {
		this.body = body;
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
		Notes other = (Notes) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
