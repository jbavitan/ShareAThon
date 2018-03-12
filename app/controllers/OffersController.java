package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

import io.ebean.Ebean;
import models.Offers;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class OffersController extends Controller {
	
	public Result getOffers() {
		return ok(Json.toJson(Ebean.find(Offers.class).findList()));
	}
	
	public Result UpdateOffers() {
	
		Ebean.update(createOffers());
		
		return ok();
	}
	
	public Result DeleteOffers() {
		
		Ebean.delete(createOffers());
		
		return ok();
	}
	
	private static Offers createOffers() {
		
		JsonNode request = request().body().asJson();
		
		return (new Offers(request.findValue("id").asInt(), 
						   request.findValue("user").asInt(), 
						   request.findValue("subCategory").asInt(), 
						   new Date(request.findValue("Date").asLong()), 
						   request.findValue("location").asInt(), 
						   request.findValue("description").asText()));
	}
	
}
