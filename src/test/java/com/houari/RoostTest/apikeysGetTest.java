// ********RoostGPT********
/*
Test generated by RoostGPT for test rest-assured-test using AI Type Open AI and AI Model gpt-4

Test generated for /apikeys_get for http method type GET in rest-assured framework

RoostTestHash=9e57a3b0dd


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

public class apikeysGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/houari/RoostTest/apikeysGetTest.csv");
    }

  
    @Test  
    public void apikeysGet_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.header("Token", map.get("API_KEY"))
                .when()
                .get("/apikeys")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
      
              if (response.jsonPath().get("total") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("total"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("apikeys") != null) {      
                for (int i = 0; i < response.jsonPath().getList("apikeys").size(); i++) {      
              if (response.jsonPath().get("apikeys["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("apikeys["+ i +"].id"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("apikeys["+ i +"].createdAt") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("apikeys["+ i +"].createdAt"), instanceOf(String.class));  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("apikeys"), instanceOf(List.class));
  
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
