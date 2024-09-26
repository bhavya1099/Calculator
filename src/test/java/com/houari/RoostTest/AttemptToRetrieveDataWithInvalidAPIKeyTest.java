// ********RoostGPT********
/*
Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 

ROOST_METHOD_HASH=61d4e70ce5
ROOST_METHOD_SIG_HASH=22194d4874

 ########## Scenario ########## 

{
  feature: 'Feature: Test API from Alphavantage.co',
  background: null,
  rule: null,
  scenario: {
    title: 'Scenario: Attempt to retrieve data with an invalid API key',
    steps: 'Given the API endpoint is "https://www.alphavantage.co/query"\n' +
      'When I send a GET request with the following parameters:\n' +
      '      | Parameter | Value                     |\n' +
      '      | function  | TIME_SERIES_DAILY_ADJUSTED |\n' +
      '      | symbol    | IBM                       |\n' +
      '      | apikey    | invalid_key               |\n' +
      'Then the response should indicate an authentication error',
    examples: ''
  }
}

*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AttemptToRetrieveDataWithInvalidAPIKeyTest {

    @Test
    public void testRetrieveDataWithInvalidAPIKey() {
        // Given
        String apiEndpoint = "https://www.alphavantage.co/query";

        // When
        Response response = given()
            .param("function", "TIME_SERIES_DAILY_ADJUSTED")
            .param("symbol", "IBM")
            .param("apikey", "invalid_key")
        .when()
            .get(apiEndpoint);

        // Then
        response.then()
            .statusCode(not(200)) // Expecting a non-200 status code for authentication error
            .body(containsString("Invalid API call")); // Assuming the error message contains this phrase
    }
}
