package tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;

public class TestonlocalAPI {
	
	
	
	
	//@Test
	public void get() {
		
		
		baseURI=" http://localhost:3000";
		
		given().
		get("/users").then().statusCode(200).log().all();
		
	}
	
	
	
	@Test
	public void post() {
		
		JSONObject request=new JSONObject();
		
		request.put("firstname", "balu");
		request.put("lastname", "ae");
		request.put("subjectid", 1);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
		
	}
	@Test
	public void put() {
		
		JSONObject request=new JSONObject();
		
		request.put("firstname", "balu");
		request.put("lastname", "ae");
		request.put("subjectid", 1);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users/1").
		then().
			statusCode(200).log().all();
		
	}
	
	@Test
	public void patch() {
		
		JSONObject request=new JSONObject();
		
		request.put("firstname", "balu");
		request.put("lastname", "ae");
		request.put("subjectid", 1);
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/users/1").
		then().
			statusCode(200).log().all();
		
	}
	@Test
	public void delete() {
		baseURI = "http://localhost:3000";
		
		when().delete("/users/2").then().statusCode(200);
	}

}
