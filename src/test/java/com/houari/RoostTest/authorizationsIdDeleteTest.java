// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Test generated for /authorizations/{id}_delete for http method type DELETE in rest-assured framework

RoostTestHash=cb128291e8


*/

// ********RoostGPT********
package com.houari.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.matchesPattern;

public class authorizationsIdDeleteTest {

    List<Map<String, String>> envList = new ArrayList<>();

    @Before
    public void setUp() {
        TestdataLoader dataloader = new TestdataLoader();
        envList = dataloader.loadData("src/test/java/com/houari/RoostTest/authorizations_idDeleteTest.csv");
    }

    @Test
    public void authorizationsIdDelete_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
            RestAssured.baseURI = map.get("BASE_URL");

            Response response = given()
                    .pathParam("id", map.get("id") != null ? map.get("id") : "")
                    .header("Token", map.get("API_KEY"))
                    .when()
                    .delete("/authorizations/{id}")
                    .then()
                    .extract().response();

            switch (response.statusCode()) {
                case 200:
                    System.out.println("Description: successful operation");
                    break;
                case 400:
                    validateErrorResponse(response);
                    break;
                case 401:
                    validateUnprocessableEntityResponse(response);
                    break;
                case 404:
                    validateNotFoundResponse(response);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + response.statusCode());
            }
        }
    }

    private void validateNotFoundResponse(Response response) {
        System.out.println("Description: Not Found");
        validateResponse(response);
    }

    private void validateUnprocessableEntityResponse(Response response) {
        System.out.println("Description: Unprocessable Entity");
        validateResponse(response);
    }

    private void validateErrorResponse(Response response) {
        System.out.println("Description: Bad Request");
        validateResponse(response);
    }

    private void validateResponse(Response response) {
        assertThat(response.jsonPath().get("error"), instanceOf(String.class));
        assertThat(response.jsonPath().get("description"), instanceOf(String.class));
        assertThat(response.jsonPath().getString("error"), matchesPattern("^validation/.*$"));
        assertThat(response.jsonPath().get("field"), instanceOf(String.class));
        assertThat(response.jsonPath().get("schema_field"), instanceOf(String.class));
    }
}
