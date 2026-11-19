package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPostExamples {
	
	@Test
	public void testget() {
		
		baseURI = "https://reqres.in/api";
		
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[4].first_name",equalTo("George")).
			body("data[*].first_name",hasItems("George","Rachel"));
		
	}
	
	
	@Test
	public void testpost() {
		
	Map<String, Object> map= new HashMap<String,Object>();
//	
//	map.put("\"name\"","Gowtham");
//	map.put("job","student");
//	
//	System.out.println(map);
//	
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
		post("/users").
	then().
		statusCode(201).
		log().all();
	
	
	}

}


































