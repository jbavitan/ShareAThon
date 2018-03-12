package models;

import javax.persistence.*;

import io.ebean.Model;

@Entity
@Table(name="T_REPORTS")
public class Report extends Model {

	// Data Members
	
	@Id
	@Column(name="REPORT_ID")
	private int Id;
	
	@Column(name="MEETING_ID")
	private int meeting;
	
	@Column(name="HAPPENED")
	private String Happend;
	
	@Column(name="RANK")
	private int Rank;
	
	@Column(name="MEETING_DESC")
	private String description;
	
	// Ctor 
	public Report(int id,
				  int meeting,
				  String happend,
				  int Rank,
				  String Description) {
		this.setDescription(Description);
		this.setHappend(happend);
		this.setId(id);
		this.setMeeting(meeting);
		this.setRank(Rank);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getMeeting() {
		return meeting;
	}

	public void setMeeting(int meeting) {
		this.meeting = meeting;
	}

	public String getHappend() {
		return Happend;
	}

	public void setHappend(String happend) {
		Happend = happend;
	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
