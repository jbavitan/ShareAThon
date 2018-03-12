package models;

import java.util.Date;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_MEETINGS")
public class Meeting  extends Model {
	
	// Data Members
	
	@Id
	@Column(name="MEETING_ID")
	private int Id;
	
	@Column(name="REQUEST_USER_ID")
	private int RequestUser;
	
	@Column(name="OFFER_USER_ID")
	private int OfferUser;
	
	@Column(name="MEETING_DATE")
	private Date Date;
	
	@Column(name="MEETING_LOCATION")
	private int Location;

	// Ctor 
	public Meeting(int id,
				   int requestUser,
				   int offerUser,
				   Date Date,
				   int location) {
		this.setId(id);
		this.setOfferUser(offerUser);
		this.setLocation(location);
		this.setRequestUser(requestUser);
		this.setDate(Date);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getRequestUser() {
		return RequestUser;
	}

	public void setRequestUser(int requestUser) {
		RequestUser = requestUser;
	}

	public int getOfferUser() {
		return OfferUser;
	}

	public void setOfferUser(int offerUser) {
		OfferUser = offerUser;
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
}
