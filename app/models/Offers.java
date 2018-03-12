package models;

import java.util.Date;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_OFFERS")
public class Offers extends Model {
	
	// Data Members
	
	@Id
	@Column(name="OFFER_ID")
	private int Id;
	
	@Column(name="USER_ID")
	private int user;
	
	@Column(name="SUB_CATEGORY_ID")
	private int subCategory;
	
	@Column(name="OFFER_DATE")
	private Date Date;
	
	@Column(name="OFFER_LOCATION")
	private int Location;
	
	@Column(name="OFFER_DESC")
	private String Description;
	
	// Ctor 
	public Offers(int id,
				  int user,
				  int subCategory,
				  Date Date,
				  int location,
				  String description) {
		this.setDescription(description);
		this.setId(id);
		this.setLocation(location);
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
