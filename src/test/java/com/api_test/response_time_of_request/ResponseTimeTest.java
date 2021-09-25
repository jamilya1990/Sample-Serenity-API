package com.api_test.response_time_of_request;

import com.api_test.utilities.SpartanAuthTestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResponseTimeTest extends SpartanAuthTestBase {

    @DisplayName("Checking response time")
    @Test
    public void test(){
        RestAssured.given().accept(ContentType.JSON)
                .auth().basic("admin","admin")
                .when().get("/api/spartans")
                .then().statusCode(200)
                .and().time(Matchers.lessThanOrEqualTo(2000L));


    }

}
