package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class PutPatchExample {
	
	@Test
	public void testput() {
		
	Map<String, Object> map= new HashMap<String,Object>();

	JSONObject request =new JSONObject(map);
	
	request.put("name","gowtham");
	request.put("job","student");
	
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in/api";
	
	given().
		header("content-type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		put("/users/2").
	then().
		statusCode(200).
		log().all();
	
	
	}
	@Test
	public void testpatch() {
		
	Map<String, Object> map= new HashMap<String,Object>();
	
	JSONObject request =new JSONObject(map);
	
	request.put("name","gowtham");
	request.put("job","student");
	
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in";
	
	given().
		header("content-type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		patch("/api/users/2").
	then().
		statusCode(200).
		log().all();
	
	
	}
	@Test
	public void testdelete() {
		
		baseURI = "https://reqres.in";
		
		when().
			delete("/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	
	}
	

}















