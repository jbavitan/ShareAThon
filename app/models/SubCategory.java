package models;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_SUB_CATEGORIES")
public class SubCategory extends Model {
	
	// Data Members
	
	@Id
	@Column(name="SUB_CATEGORY_ID")
	private int Id;
	
	@Column(name="CATEGORY_ID")
	private int category;
	
	@Column(name="SUB_CATEGORY_NAME")
	private String Name;
	
	// Ctor
	public SubCategory(int id,
					   int category,
					   String name) {
		this.setId(id);
		this.setCategory(category);
		this.setName(name);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
