package models;

import java.util.Date;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_REQUESTS")
public class Requests extends Model {
	
	// Data Member
	
	@Id
	@Column(name="REQUEST_ID")
	private int Id;
	
	@Column(name="USER_ID")
	private int user;
	
	@Column(name="SUB_CATEGORY_ID")
	private int subCategory;
	
	@Column(name="REQUEST_DATE")
	private Date Date;
	
	@Column(name="REQUEST_LOCATION")
	private int Location;
	
	@Column(name="REQUEST_DESC")
	private String Description;
	
	// Ctor
	
	public Requests (int Id,              
                   	 int user,              
                     int subCategory,
                     Date Date,        
                     int Location,        
                     String Description)    {
		
		this.setDescription(Description);
		this.setId(Id);
		this.setLocation(Location);
		this.setSubCategory(subCategory);
		this.setDate(Date);
		this.setUser(user);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(int subCategory) {
		this.subCategory = subCategory;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public int getLocation() {
		return Location;
	}

	public void setLocation(int location) {
		Location = location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}