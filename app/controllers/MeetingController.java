package controllers;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

import io.ebean.Ebean;
import models.Meeting;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class MeetingController extends Controller {
	
	public Result getMeetings() {
		return ok(Json.toJson(Ebean.find(Meeting.class).findList()));
	}
	
	
	public Result UpdateMeeting() {
		
		Ebean.update(createMeeting());
		
		return ok();
	}
	
	
	public Result DeleteMeeting() {
		
		Ebean.delete(createMeeting());
		
		return ok();
	}
	
	private static Meeting createMeeting() {
		
		JsonNode request = request().body().asJson();
		
		return (new Meeting(request.findValue("id").asInt(), 
						    request.findValue("requestUser").asInt(), 
						    request.findValue("offerUser").asInt(), 
						    new Date(request.findValue("Date").asLong()), 
						    request.findValue("location").asInt()));
	}

}
