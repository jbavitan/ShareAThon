package controllers;

import io.ebean.Ebean;
import models.City;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class CityController extends Controller {
	
	public Result getCities() {
		return ok(Json.toJson(Ebean.find(City.class).findList()));
	}

}
