package com.api_test.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class SpartanAuthTestBase {

@BeforeAll
    public static void initializer(){
    RestAssured.baseURI = "http://52.207.61.129:7000";
}

@AfterAll
    public static void tear(){
    RestAssured.reset();
}
}
