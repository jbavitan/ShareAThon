package models;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_CATEGORIES")
public class Category extends Model {
	
	// Data Members
	
	@Id
	@Column(name="CATEGORY_ID")
	private int Id;
	
	@Column(name="CATEGORY_NAME")
	private String name;
	
	// Ctor
	
	public Category(int Id, String Name) {
		this.setId(Id);
		this.setName(Name);
	}

	
	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
