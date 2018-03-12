package controllers;

import io.ebean.Ebean;
import models.Category;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoryController extends Controller {
	
	public Result getCategories() {
		
		return ok(Json.toJson(Ebean.find(Category.class).findList()));
	}
}
