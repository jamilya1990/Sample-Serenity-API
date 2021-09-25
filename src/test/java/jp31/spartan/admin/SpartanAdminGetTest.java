package jp31.spartan.admin;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class SpartanAdminGetTest {

    @BeforeAll
    public static void init(){
        baseURI = "http://44.195.19.167:7000";
    }

    @Test
    public void getAllSpartans(){
        given()
                .accept(ContentType.JSON)
                .auth().basic("admin","admin")
         .when().get("api/spartans")
         .then().statusCode(200)
                .contentType(ContentType.JSON);
    }
}
