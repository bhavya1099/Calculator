// ********RoostGPT********
/*
Test generated by RoostGPT for test rest-assured-test using AI Type Open AI and AI Model gpt-4-1106-preview

Test generated for /recipients/branches_get for http method type GET in rest-assured framework

RoostTestHash=74a40da00e


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

public class branchesGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/com/houari/RoostTest/branchesGetTest.csv");
    }

  
    @Test  
    public void branchesGet_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.pathParam("coc-number", map.get("coc-number") != null ? map.get("coc-number") : "")
				.pathParam("coc-branch-number", map.get("coc-branch-number") != null ? map.get("coc-branch-number") : "")
				.pathParam("trade-name", map.get("trade-name") != null ? map.get("trade-name") : "")
				.pathParam("size", map.get("size") != null ? map.get("size") : "")
				.pathParam("offset", map.get("offset") != null ? map.get("offset") : "")
				.header("Token", map.get("API_KEY"))
                .when()
                .get("/recipients/branches")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
      
              if (response.jsonPath().get("total") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("total"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("branches") != null) {      
                for (int i = 0; i < response.jsonPath().getList("branches").size(); i++) {      
              if (response.jsonPath().get("branches["+ i +"].id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].id"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].email") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("branches["+ i +"].email"), matchesPattern("^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].email"), instanceOf(String.class));MatcherAssert.assertThat(
                  response.jsonPath().getString("branches["+ i +"].email"),
                  Matchers.matchesPattern("^[^\s@]+@[^\s@]+\.[^\s@]+$")
                ); 
  
          }
      
              if (response.jsonPath().get("branches["+ i +"].phone") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].phone"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].cocNumber") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("branches["+ i +"].cocNumber"), matchesPattern("^\d{8}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].cocNumber"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].cocBranchNumber") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("branches["+ i +"].cocBranchNumber"), matchesPattern("^\d{12}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].cocBranchNumber"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].tradeName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].tradeName"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].tradeNames") != null) {      
                for (int i1 = 0; i1 < response.jsonPath().getList("branches["+ i +"].tradeNames").size(); i1++) {      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("branches["+ i +"].tradeNames"), instanceOf(List.class));
  
          }
      
              if (response.jsonPath().get("branches["+ i +"].eoriNumber") != null) {    
                MatcherAssert.assertThat(response.jsonPath().getString("branches["+ i +"].eoriNumber"), matchesPattern("^NL\d{9}$")); 
  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].eoriNumber"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].deregistrationDate") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].deregistrationDate"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].createdAt") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].createdAt"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("branches["+ i +"].updatedAt") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("branches["+ i +"].updatedAt"), instanceOf(String.class));  
          }
      
                  }    
                MatcherAssert.assertThat(response.jsonPath().getList("branches"), instanceOf(List.class));
  
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
