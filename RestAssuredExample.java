import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredExample {

    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Send GET request
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .get("/posts/1")
                        .then()
                        .statusCode(200) // Check that the status code is 200
                        .body("userId", equalTo(1)) // Check that userId is 1
                        .body("id", equalTo(1)) // Check that id is 1
                        .body("title", notNullValue()) // Check that the title is not null
                        .extract().response();

        // Print the response body
        System.out.println("Response Body:");
        System.out.println(response.getBody().asString());
    }
}

