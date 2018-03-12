package controllers;

import io.ebean.Ebean;
import models.SubCategory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class SubCategoryController extends Controller {
	
	public Result getSubCategory() {
		return ok(Json.toJson(Ebean.find(SubCategory.class).findList()));
	}
}
