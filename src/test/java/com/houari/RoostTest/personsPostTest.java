// ********RoostGPT********
/*
Test generated by RoostGPT for test rest-assured-test using AI Type Open AI and AI Model gpt-4

Test generated for /recipients/persons_post for http method type POST in rest-assured framework

RoostTestHash=b4614c0581


*/

// ********RoostGPT********
package com.houari.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class personsPostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/houari/RoostTest/personsPostTest.csv");
    }

  
    @Test  
    public void personsPost_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"initials\": \"" + (map.get("initials") != null ? map.get("initials") : "") + "\",\n" +
					"  \"firstName\": \"" + (map.get("firstName") != null ? map.get("firstName") : "") + "\",\n" +
					"  \"middleName\": \"" + (map.get("middleName") != null ? map.get("middleName") : "") + "\",\n" +
					"  \"lastName\": \"" + (map.get("lastName") != null ? map.get("lastName") : "") + "\",\n" +
					"  \"birthDate\": \"" + (map.get("birthDate") != null ? map.get("birthDate") : "") + "\",\n" +
					"  \"birthPlace\": \"" + (map.get("birthPlace") != null ? map.get("birthPlace") : "") + "\",\n" +
					"  \"phone\": \"" + (map.get("phone") != null ? map.get("phone") : "") + "\",\n" +
					"  \"email\": \"" + (map.get("email") != null ? map.get("email") : "") + "\",\n" +
					"  \"postalCode\": \"" + (map.get("postalCode") != null ? map.get("postalCode") : "") + "\",\n" +
					"  \"houseNumber\": \"" + (map.get("houseNumber") != null ? map.get("houseNumber") : "") + "\",\n" +
					"  \"houseNumberPostfix\": \"" + (map.get("houseNumberPostfix") != null ? map.get("houseNumberPostfix") : "") + "\",\n" +
					"  \"countryCode\": \"" + (map.get("countryCode") != null ? map.get("countryCode") : "") + "\",\n" +
					"  \"reference\": \"" + (map.get("reference") != null ? map.get("reference") : "") + "\n" +
 				"}")
				.header("Token", map.get("API_KEY"))
                .when()
                .post("/recipients/persons")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 201) {
					System.out.println("Description: successful operation");
      
              if (response.jsonPath().get("id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("initials") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("initials"), matchesPattern("^[A-Z]{1,6}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("initials"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("firstName") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("firstName"), matchesPattern("^[\p{L} .'-]{1,50}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("firstName"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("middleName") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("middleName"), matchesPattern("^[\p{L} .'-]{1,20}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("middleName"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("lastName") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("lastName"), matchesPattern("^[\p{L} .'-]{2,50}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("lastName"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("birthDate") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("birthDate"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("birthPlace") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("birthPlace"), matchesPattern("^[\p{L} .,'-]{2,100}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("birthPlace"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("phone") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("phone"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("email") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("email"), matchesPattern("^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));MatcherAssert.assertThat(
                  response.jsonPath().getString("email"),
                  Matchers.matchesPattern("^[^\s@]+@[^\s@]+\.[^\s@]+$")
                ); 
  
          }
      
              if (response.jsonPath().get("postalCode") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("postalCode"), matchesPattern("^[0-9]{4}[A-Z]{2}$|^[0-9]{4,5}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("postalCode"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("houseNumber") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("houseNumber"), matchesPattern("^\d{1,6}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("houseNumber"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("houseNumberPostfix") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("houseNumberPostfix"), matchesPattern("^[a-zA-Z .,_'-]{0,20}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("houseNumberPostfix"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("countryCode") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("countryCode"), matchesPattern("^[A-Z]{2}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("countryCode"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("reference") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("reference"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("reference").length(), lessThanOrEqualTo(100));
  
          }
      
              if (response.jsonPath().get("createdAt") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("updatedAt") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("updatedAt"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: Bad Request");
      
              if (response.jsonPath().get("error") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("error"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("description") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("error") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("error"), matchesPattern("^validation/.*$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("error"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("description") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("value") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("value"), instanceOf(undefined.class));  
          }
      
              if (response.jsonPath().get("field") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("field"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("schema_field") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("schema_field"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 401) {
					System.out.println("Description: Authentication Required");
      
              if (response.jsonPath().get("error") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("error"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("description") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("error") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("error"), matchesPattern("^validation/.*$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("error"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("description") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("value") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("value"), instanceOf(undefined.class));  
          }
      
              if (response.jsonPath().get("field") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("field"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("schema_field") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("schema_field"), instanceOf(String.class));  
          }
				}
  
            }  
    }
}
