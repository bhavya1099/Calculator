// ********RoostGPT********
/*
Test generated by RoostGPT for test integration-scenarioTab-test using AI Type Open AI and AI Model gpt-4-turbo

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

import static org.hamcrest.Matchers.*;

public class SelectingBroadbandPackageBasedOnAvailabilityTest {

    private final String dataFilePath = "src" + System.getProperty("file.separator") + "test" + System.getProperty("file.separator") + "java" + System.getProperty("file.separator") + "com" + System.getProperty("file.separator") + "houari" + System.getProperty("file.separator") + "RoostTest" + System.getProperty("file.separator") + "SelectingBroadbandPackageBasedOnAvailabilityTest.csv";
    private Map<String, String> testData = new HashMap<>();

    @BeforeEach
    public void setup() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
        String line = reader.readLine(); // Skip headers
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] data = line.split("\\^\\|\\^");
                testData.put("METHOD", data[0]);
                testData.put("URL", data[1]);
                testData.put("REQ_HEADERS", data[2]);
                testData.put("REQ_BODY", data[3]);
                testData.put("RESPONSE_CODE", data[4]);
                testData.put("RESPONSE_BODY", data[5]);
            }
        }
        reader.close();
    }

    @Test
    public void testSelectingBroadbandPackageBasedOnAvailability() {
        // Given "John Doe" received the broadband availability report
        // And he finds that "BL_1000MB" broadband speed is available at his address
        // When John selects the "BL_1000MB" package
        // Then the system should validate the selection
        // And confirm the broadband package for John's address

        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        if (!testData.get("REQ_HEADERS").isEmpty()) {
            Map headers = new HashMap();
            // Assuming headers are in JSON format
            headers = new HashMap(Map.of(testData.get("REQ_HEADERS").split(",")));
            headers.forEach((key, value) -> request.header(String.valueOf(key), value));
        }

        Response response = request.body(testData.get("REQ_BODY"))
                .when()
                .post(testData.get("URL"));

        response.then()
                .statusCode(Integer.parseInt(testData.get("RESPONSE_CODE")))
                .body("control.type", equalTo("S"))
                .body("control.message", equalTo("Success"))
                .body("control.code", equalTo("ACK200"))
                .body("resource.resource.inventoryId", equalTo(123456789))
                .body("resource.resource.maxBandwidth", equalTo(1000))
                .body("resource.resource.availabilityType", equalTo(1))
                .body("resource.resource.availabilityCode", equalTo(0))
                .body("resource.resource.availabilityDescription", equalTo("Available"));
    }
}
