package Reqests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Weather {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification spec = RestAssured.given();

		Map<String, Object> queryParam = new HashMap<String, Object>();

		Response response = spec.get("/api/unknown/2");

		/*
		 * System.out.println(response.jsonPath().get("support"));
		 * System.out.println(response.jsonPath().get("data.name"));
		 * System.out.println(response.jsonPath().get("data.year"));
		 * System.out.println(response.jsonPath().get("data.pantone_value"));
		 */
//		
//		System.out.println("Thank God!!");
//		String id = response.jsonPath().getString("data.id");
//		System.out.println("Id is : " + id);
//		System.out.println("===================");
//		Map<String, Object> datas = response.jsonPath().getMap("data");
//
//		datas.forEach((k, v) -> {
//			System.out.println("k " + k + " v" + v);
//		}
//
//		);
//		System.out.println(datas);

		// System.out.println(response.getBody().asString());
		
	List<Map<String,Object>> datas=response.jsonPath().getList("data");
		 
		System.out.println("Response data is : "+datas);
		
	}
}
