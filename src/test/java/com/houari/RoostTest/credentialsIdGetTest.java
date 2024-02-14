// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Test generated for /credentials/{id}_get for http method type GET in rest-assured framework

RoostTestHash=018c225aea


*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CredentialsIdGetTest {

    private List<Map<String, String>> environmentList = new ArrayList<>();

    @Before
    public void setUp() {
        TestDataLoader dataLoader = new TestDataLoader();
        environmentList = dataLoader.loadData("src/test/java/com/houari/RoostTest/credentials_idGetTest.csv");
    }

    @Test
    public void credentialsIdGet_Test() {
        setUp();
        for (Map<String, String> map : environmentList) {
            RestAssured.baseURI = map.get("BASE_URL");

            Response response = given()
                    .pathParam("id", map.get("id") != null ? map.get("id") : "")
                    .header("Token", map.get("API_KEY"))
                    .when()
                    .get("/credentials/{id}")
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
                    validateAuthenticationRequiredResponse(response);
                    break;
                default:
                    // Handle other status codes if needed
                    break;
            }
        }
    }

    private void validateSuccessfulResponse(Response response) {
        assertThat(response.jsonPath().getString("id"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("format"), anyOf(equalTo("jwt_vc_json"), equalTo("jwt_vc_json-ld"), equalTo("ldp_vc")));
        assertThat(response.jsonPath().getString("credential"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("status"), anyOf(equalTo("active"), equalTo("suspended"), equalTo("revoked"), equalTo("expired"), equalTo("pending")));
        assertThat(response.jsonPath().getString("statusUpdatedAt"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("createdAt"), instanceOf(String.class));
    }

    private void validateBadRequestResponse(Response response) {
        assertThat(response.jsonPath().getString("error"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("description"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("value"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("field"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("schema_field"), instanceOf(String.class));
    }

    private void validateAuthenticationRequiredResponse(Response response) {
        assertThat(response.jsonPath().getString("error"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("description"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("value"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("field"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("schema_field"), instanceOf(String.class));
    }
}
