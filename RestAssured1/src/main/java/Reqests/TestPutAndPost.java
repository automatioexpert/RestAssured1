package Reqests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPutAndPost {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification request = RestAssured.given();
		request.header(new Header("content-type", "application/json"));

		List<Integer> jobsIDs = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 5, 9));

		request.body(TestPutAndPost.getEmpRecord());

		Response response = request.post("/api/users");
//
		response.prettyPrint();

//		JSONObject requestBody= new JSONObject();
//		requestBody.put("name", "tssi");
//		requestBody.put("job", "leader");
//		requestBody.put("jobsIDs",jobsIDs);
//		
//		
//		request.body(requestBody.toString());
//		
//		Response response =request.post("/api/users");
//		
//		response.prettyPrint();

	}

	public static EmployeeRecord getEmpRecord() {
		EmployeeRecord er = new EmployeeRecord();
		er.setEmpName("ters");
		er.setJob("leader");

		return er;
	}

}
