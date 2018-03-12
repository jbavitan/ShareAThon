package models;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_USERS")
public class User extends Model {

	// Data Members
	
	@Id
	@Column(name="USER_ID")
	private int Id;
	
	@Column(name="USER_NAME")
	private String Name;
	
	// Ctor 
	public User(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
