// ********RoostGPT********
/*
Test generated by RoostGPT for test karate-test using AI Type Open AI and AI Model gpt-4-turbo

ROOST_METHOD_HASH=9adbc3cb1f
ROOST_METHOD_SIG_HASH=b70f07ae36

 ########## Scenario ########## 

{
  feature: 'Feature: Check broadband service availability and selection',
  background: 'Background: \n' +
    '    Given a customer base where each customer has a unique subscriber ID',
  rule: null,
  scenario: {
    title: 'Scenario: Selecting a broadband package based on availability',
    steps: 'Given "John Doe" received the broadband availability report\n' +
      'And he finds that "BL_1000MB" broadband speed is available at his address\n' +
      'When John selects the "BL_1000MB" package\n' +
      'Then the system should validate the selection\n' +
      "And confirm the broadband package for John's address",
    examples: ''
  }
}

*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SelectingBroadbandPackageBasedOnAvailabilityTest {
    private Map<String, String> headers = new HashMap<>();
    private String payload;
    private int expectedStatusCode;
    private String expectedResponseBody;

    @BeforeEach
    public void setup() throws IOException {
        String path = Paths.get("src", "test", "java", "com", "houari", "RoostTest", "SelectingBroadbandPackageBasedOnAvailabilityTest.csv").toString();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) continue;
            String[] data = line.split("\\^\\|\\^");
            if (data[0].equals("METHOD")) continue; // Skip header line

            String method = data[0];
            String url = data[1];
            String reqHeaders = data[2];
            String reqBody = data[3];
            String responseCode = data[4];
            String responseBody = data[5];

            headers.clear();
            if (!reqHeaders.isEmpty()) {
                for (String header : reqHeaders.split(",")) {
                    String[] keyValue = header.split(":");
                    headers.put(keyValue[0].trim(), keyValue[1].trim());
                }
            }
            payload = reqBody;
            expectedStatusCode = Integer.parseInt(responseCode);
            expectedResponseBody = responseBody;
        }
        reader.close();
    }

    @Test
    public void testBroadbandAvailabilityAndSelection() {
        // Given "John Doe" received the broadband availability report
        // And he finds that "BL_1000MB" broadband speed is available at his address
        // When John selects the "BL_1000MB" package
        // Then the system should validate the selection
        // And confirm the broadband package for John's address

        RequestSpecification request = RestAssured.given().headers(headers).body(payload);

        Response response = request.post("/availabilityCheck");

        response.then().assertThat()
                .statusCode(expectedStatusCode)
                .body("control.type", is("S"))
                .body("control.message", equalTo("Success"))
                .body("control.code", equalTo("ACK200"))
                .body("resource.resource.inventoryId", equalTo(123456789))
                .body("resource.resource.maxBandwidth", equalTo(1000))
                .body("resource.resource.availabilityType", equalTo(1))
                .body("resource.resource.availabilityCode", equalTo(0))
                .body("resource.resource.availabilityDescription", equalTo("Available"))
                .body("resource.resource.products", is(notNullValue()));
    }
}
