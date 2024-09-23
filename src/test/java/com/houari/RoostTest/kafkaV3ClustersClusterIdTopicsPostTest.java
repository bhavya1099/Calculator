// ********RoostGPT********
/*
Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 

Test generated for /kafka/v3/clusters/{cluster_id}/topics_post for http method type POST in rest-assured framework

RoostTestHash=8cae6045bc


*/

// ********RoostGPT********
package com.houari.RoostTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
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
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.Arrays;

public class kafkaV3ClustersClusterIdTopicsPostTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @BeforeEach
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      String[] envVarsList = {"cluster_id"};
      envList = dataloader.load("src/test/java/com/houari/RoostTest/kafka_v3_clusters_cluster_id_topicsPostTest.csv", envVarsList);
    }

  
    @Test  
    public void kafkaV3ClustersClusterIdTopicsPost_Test() throws JSONException {
        this.setUp();
        Integer testNumber = 1;
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = (testData.get("mkiu_BASE_URL") != null && !testData.get("mkiu_BASE_URL").isEmpty()) ? testData.get("mkiu_BASE_URL"): "https://api.confluent.cloud";  
          JSONObject requestBodyObject = new JSONObject();
          if(testData.get("RequestBody") != null){
              requestBodyObject = new JSONObject(testData.get("RequestBody"));
          }
                Response responseObj = given()
				.contentType(ContentType.JSON)
				.body(requestBodyObject.toString())
				.header("Authorization", "Bearer " + testData.get("mkiu_basic"))
                .when()
                .post("/kafka/v3/clusters/{cluster_id}/topics")  
                .then() 
                .extract().response(); 
              JsonPath response;
              String contentType = responseObj.getContentType();

              System.out.printf("Test Case %d: kafkaV3ClustersClusterIdTopicsPost_Test \n", testNumber++);
              System.out.println("Request: POST /kafka/v3/clusters/{cluster_id}/topics");
              System.out.println("Status Code: " + responseObj.statusCode());
              if (testData.get("statusCode") != null) {
                String statusCodeFromCSV = testData.get("statusCode");
                if (statusCodeFromCSV.contains("X")) {
                  MatcherAssert.assertThat(
                      "Expected a status code of category " + statusCodeFromCSV + ", but got "
                          + Integer.toString(responseObj.statusCode()) + " instead",
                      Integer.toString(responseObj.statusCode()).charAt(0), equalTo(statusCodeFromCSV.charAt(0)));
                } else {
                  MatcherAssert.assertThat(
                      Integer.toString(responseObj.statusCode()), equalTo(statusCodeFromCSV));
                }
              } 
              				else if(Integer.toString(responseObj.statusCode()).charAt(0) != '5'){  
      List<Integer> expectedStatusCodes = Arrays.asList(200,201,400,401,403,429);
				MatcherAssert.assertThat(responseObj.statusCode(), is(in(expectedStatusCodes)));
          }
				String stringifiedStatusCode = Integer.toString(responseObj.statusCode());
        switch(responseObj.statusCode()){
        
          case 200:
            stringifiedStatusCode = "200";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 201:
            stringifiedStatusCode = "201";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 400:
            stringifiedStatusCode = "400";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 401:
            stringifiedStatusCode = "401";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
          case 403:
            stringifiedStatusCode = "403";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
    }

      switch(Integer.toString(responseObj.statusCode()).charAt(0)){
      
          case '5':
            stringifiedStatusCode = "5XX";
            MatcherAssert.assertThat(contentType, equalTo("application/json"));
            break;
         
    }

      
              if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
                String xmlResponse = responseObj.asString();
                JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
                JSONObject jsonData = jsonResponse.getJSONObject("xml");
                String jsonString = jsonData.toString();
                response = new JsonPath(jsonString);
        
              } else if(contentType.contains("application/json")){  
                response = responseObj.jsonPath(); 
              } else {
                System.out.println("Response content type found: "+contentType+", but RoostGPT currently only supports the following response content types: application/json,text/xml,application/xml");
                continue;
              }
         
                if(stringifiedStatusCode.equals("200")){					System.out.println("Description: The created topic.");
				}
if(stringifiedStatusCode.equals("201")){					System.out.println("Description: The created topic.");
				}
if(stringifiedStatusCode.equals("400")){					System.out.println("Description: Indicates a bad request error. It could be caused by an unexpected request body format or other forms of request validation failure.");
      
              if (response.get("id") != null) {
                  
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

              }
      
              if (response.get("status") != null) {
                  
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
              }
      
              if (response.get("code") != null) {
                  
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
              }
      
              if (response.get("title") != null) {
                  
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
              }
      
              if (response.get("detail") != null) {
                  
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
              }
      
              if (response.get("source") != null) {
                      
              if (response.get("source.pointer") != null) {
                  
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
              }
      
              if (response.get("source.parameter") != null) {
                  
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
              }

              }
      
              if (response.get("error_code") != null) {
                  
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
              }
      
              if (response.get("message") != null) {
                  
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
              }
				}
if(stringifiedStatusCode.equals("401")){					System.out.println("Description: Indicates a client authentication error. Kafka authentication failures will contain error code 40101 in the response body.");
      
              if (response.get("id") != null) {
                  
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

              }
      
              if (response.get("status") != null) {
                  
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
              }
      
              if (response.get("code") != null) {
                  
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
              }
      
              if (response.get("title") != null) {
                  
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
              }
      
              if (response.get("detail") != null) {
                  
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
              }
      
              if (response.get("source") != null) {
                      
              if (response.get("source.pointer") != null) {
                  
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
              }
      
              if (response.get("source.parameter") != null) {
                  
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
              }

              }
      
              if (response.get("error_code") != null) {
                  
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
              }
      
              if (response.get("message") != null) {
                  
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
              }
				}
if(stringifiedStatusCode.equals("403")){					System.out.println("Description: Indicates a client authorization error. Kafka authorization failures will contain error code 40301 in the response body.");
      
              if (response.get("id") != null) {
                  
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

              }
      
              if (response.get("status") != null) {
                  
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
              }
      
              if (response.get("code") != null) {
                  
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
              }
      
              if (response.get("title") != null) {
                  
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
              }
      
              if (response.get("detail") != null) {
                  
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
              }
      
              if (response.get("source") != null) {
                      
              if (response.get("source.pointer") != null) {
                  
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
              }
      
              if (response.get("source.parameter") != null) {
                  
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
              }

              }
      
              if (response.get("error_code") != null) {
                  
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
              }
      
              if (response.get("message") != null) {
                  
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
              }
				}
if(stringifiedStatusCode.equals("429")){					System.out.println("Description: Indicates that a rate limit threshold has been reached, and the client should retry again later.");
				}
if(stringifiedStatusCode.equals("5XX")){					System.out.println("Description: A server-side problem that might not be addressable from the client side. Retriable Kafka errors will contain error code 50003 in the response body.");
      
              if (response.get("id") != null) {
                  
                MatcherAssert.assertThat(response.get("id"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("id").length(), lessThanOrEqualTo(255));

              }
      
              if (response.get("status") != null) {
                  
                MatcherAssert.assertThat(response.get("status"), instanceOf(String.class));
              }
      
              if (response.get("code") != null) {
                  
                MatcherAssert.assertThat(response.get("code"), instanceOf(String.class));
              }
      
              if (response.get("title") != null) {
                  
                MatcherAssert.assertThat(response.get("title"), instanceOf(String.class));
              }
      
              if (response.get("detail") != null) {
                  
                MatcherAssert.assertThat(response.get("detail"), instanceOf(String.class));
              }
      
              if (response.get("source") != null) {
                      
              if (response.get("source.pointer") != null) {
                  
                MatcherAssert.assertThat(response.get("source.pointer"), instanceOf(String.class));
              }
      
              if (response.get("source.parameter") != null) {
                  
                MatcherAssert.assertThat(response.get("source.parameter"), instanceOf(String.class));
              }

              }
      
              if (response.get("error_code") != null) {
                  
                MatcherAssert.assertThat(response.get("error_code"), instanceOf(Integer.class));
              }
      
              if (response.get("message") != null) {
                  
                MatcherAssert.assertThat(response.get("message"), instanceOf(String.class));
              }
				}


            }  
    }
}
