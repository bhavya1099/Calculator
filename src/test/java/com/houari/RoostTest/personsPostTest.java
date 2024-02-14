// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

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
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hamcrest.MatcherAssert;

public class PersonsPostTest {

    List<Map<String, String>> envList = new ArrayList<>();

    @Before
    public void setUp() {
        TestdataLoader dataloader = new TestdataLoader();
        envList = dataloader.loadData("src/test/java/com/houari/RoostTest/personsPostTest.csv");
    }

    @Test
    public void personsPost_Test() {
        setUp();
        for (Map<String, String> map : envList) {
            RestAssured.baseURI = map.get("BASE_URL");

            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(generateRequestBody(map))
                    .header("Token", map.get("API_KEY"))
                    .when()
                    .post("/recipients/persons")
                    .then()
                    .extract().response();

            switch (response.statusCode()) {
                case 201:
                    validateSuccessfulResponse(response);
                    break;
                case 400:
                    validateBadRequestResponse(response);
                    break;
                case 404:
                    validateNotFoundResponse(response);
                    break;
                case 422:
                    validateUnprocessableEntityResponse(response);
                    break;
                default:
                    System.out.println("Unexpected status code: " + response.statusCode());
            }
        }
    }

    private String generateRequestBody(Map<String, String> map) {
        return "{\n" +
                "  \"initials\": \"" + map.getOrDefault("initials", "") + "\",\n" +
                "  \"firstName\": \"" + map.getOrDefault("firstName", "") + "\",\n" +
                "  \"middleName\": \"" + map.getOrDefault("middleName", "") + "\",\n" +
                "  \"lastName\": \"" + map.getOrDefault("lastName", "") + "\",\n" +
                "  \"birthDate\": \"" + map.getOrDefault("birthDate", "") + "\",\n" +
                "  \"birthPlace\": \"" + map.getOrDefault("birthPlace", "") + "\",\n" +
                "  \"phone\": \"" + map.getOrDefault("phone", "") + "\",\n" +
                "  \"email\": \"" + map.getOrDefault("email", "") + "\",\n" +
                "  \"postalCode\": \"" + map.getOrDefault("postalCode", "") + "\",\n" +
                "  \"houseNumber\": \"" + map.getOrDefault("houseNumber", "") + "\",\n" +
                "  \"houseNumberPostfix\": \"" + map.getOrDefault("houseNumberPostfix", "") + "\",\n" +
                "  \"countryCode\": \"" + map.getOrDefault("countryCode", "") + "\",\n" +
                "  \"reference\": \"" + map.getOrDefault("reference", "") + "\n" +
                "}";
    }

    private void validateSuccessfulResponse(Response response) {
        // Add assertions for a successful response (status code 201)
    }

    private void validateBadRequestResponse(Response response) {
        // Add assertions for a bad request response (status code 400)
    }

    private void validateNotFoundResponse(Response response) {
        // Add assertions for a not found response (status code 404)
    }

    private void validateUnprocessableEntityResponse(Response response) {
        // Add assertions for an unprocessable entity response (status code 422)
    }
}
