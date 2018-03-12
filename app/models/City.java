package models;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_CITIES")
public class City  extends Model {
	
	// Data Members
	@Id
	@Column(name="CITY_ID")
	private int Id;
	
	@Column(name="CITY_NAME")
	private String name;
	
	// Ctor
	public City(int id,
				String name){
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
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
