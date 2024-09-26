// ********RoostGPT********
/*
Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 

ROOST_METHOD_HASH=8891f7df5d
ROOST_METHOD_SIG_HASH=ea14a43624

 ########## Scenario ########## 

{
  feature: 'Feature: Test API from Alphavantage.co',
  background: null,
  rule: null,
  scenario: {
    title: 'Scenario: Get Social Sentiment',
    steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
      'When I send a GET request to "/stock/social-sentiment?symbol=AAPL"\n' +
      'Then the response status code should be 200\n' +
      'And the response should contain social sentiment data',
    examples: ''
  }
}

*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetSocialSentimentTest {

    private static final String BASE_URL = "https://finnhub.io/api/v1";
    private static final String ENDPOINT = "/stock/social-sentiment?symbol=AAPL";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetSocialSentiment() {
        Response response = given()
            .when()
            .get(ENDPOINT)
            .then()
            .statusCode(200)
            .body("$", not(empty()))
            .extract()
            .response();

        // Additional assertions can be added here to verify the structure and content of the social sentiment data
        // For example:
        // response.then().body("reddit", notNullValue());
        // response.then().body("twitter", notNullValue());
    }
}
