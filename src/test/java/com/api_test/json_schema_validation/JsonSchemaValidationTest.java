package com.api_test.json_schema_validation;

import com.api_test.utilities.SpartanAuthTestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JsonSchemaValidationTest extends SpartanAuthTestBase {

    @DisplayName("Get request to verify one spartan against schema")
    @Test
    public void schemaValidation(){
        RestAssured.given().accept(ContentType.JSON)
                .and().pathParam("id",206)
                .and().auth().basic("admin","admin")
           .when()
                .get("/api/spartans/{id}")
                .then().contentType(ContentType.JSON)
                .and().statusCode(200)
        .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("SingleSpartanSchema.json"));

    }

    @DisplayName("Get all spartans amd verify schema")
    @Test
    public void getAllSpartans() {
        RestAssured.given().accept(ContentType.JSON)
                .and().auth().basic("admin","admin")
                .when()
                .get("/api/spartans")
                .then().contentType(ContentType.JSON)
                .and().statusCode(200)
                .and().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/java/com/api_test/json_schema_validation/allSpartansSchema.json")));
    }

    @DisplayName("Post 1 spartan and verify with schema")
    @Test
    public void postSpartanAndVerifyWithSchema(){

        RestAssured.given()
                .contentType(ContentType.JSON)
                .auth().basic("admin","admin")
                .body("{\n" +
                        "    \"gender\": \"Male\",\n" +
                        "    \"name\": \"Mike\",\n" +
                        "    \"phone\": 9990009991\n" +
                        "}")
             .when().post("/api/spartans")
             .then().contentType(ContentType.JSON).statusCode(201)
                .body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/java/com/api_test/json_schema_validation/spartanPostJsonSchema.json")));


    }


}
