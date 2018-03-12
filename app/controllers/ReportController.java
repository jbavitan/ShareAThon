package controllers;

import io.ebean.Ebean;
import models.Report;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class ReportController extends Controller{
	
	public Result getReport() {
		return ok(Json.toJson(Ebean.find(Report.class).findList()));
	}

}
