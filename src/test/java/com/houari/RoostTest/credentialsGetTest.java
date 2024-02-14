// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Test generated for /credentials_get for http method type GET in rest-assured framework

RoostTestHash=66f52a572f


*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CredentialsGetTest {

    private List<Map<String, String>> envList = new ArrayList<>();

    @Before
    public void setUp() {
        TestDataLoader dataLoader = new TestDataLoader();
        envList = dataLoader.loadData("src/test/java/com/houari/RoostTest/credentialsGetTest.csv");
    }

    @Test
    public void credentialsGet_Test() {
        for (Map<String, String> map : envList) {
            RestAssured.baseURI = map.get("BASE_URL");

            Response response = given()
                    .pathParam("size", map.get("size") != null ? map.get("size") : "")
                    .pathParam("offset", map.get("offset") != null ? map.get("offset") : "")
                    .header("Token", map.get("API_KEY"))
                    .when()
                    .get("/credentials")
                    .then()
                    .extract().response();

            switch (response.statusCode()) {
                case 200:
                    validateSuccessfulResponse(response);
                    break;
                case 400:
                    validateBadRequestResponse(response);
                    break;
                case 401:
                    validateUnauthorizedResponse(response);
                    break;
                default:
                    System.out.println("Unexpected status code: " + response.statusCode());
            }
        }
    }

    private void validateSuccessfulResponse(Response response) {
        System.out.println("Description: successful operation");
        assertThat(response.jsonPath().get("total"), instanceOf(Integer.class));
        assertThat(response.jsonPath().getList("credentials"), instanceOf(List.class));
        // Further assertions for "credentials" can be added here
    }

    private void validateBadRequestResponse(Response response) {
        System.out.println("Description: Bad Request");
        assertThat(response.jsonPath().get("error"), instanceOf(String.class));
        assertThat(response.jsonPath().get("description"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("error"), matchesPattern("^validation/.*$"));
        // Further assertions for "Bad Request" can be added here
    }

    private void validateUnauthorizedResponse(Response response) {
        System.out.println("Description: Authentication Required");
        assertThat(response.jsonPath().get("error"), instanceOf(String.class));
        assertThat(response.jsonPath().get("description"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("error"), matchesPattern("^validation/.*$"));
        // Further assertions for "Authentication Required" can be added here
    }
}
