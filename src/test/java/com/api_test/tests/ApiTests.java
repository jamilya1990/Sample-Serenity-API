package com.api_test.tests;

import com.api_test.pojo.Employee;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.json.Json;

public class ApiTests {

    @Test
    public void test(){
        Employee employee1 = new Employee("John", "Doe", 111);

        //serialization -> java to json

        Json json = new Json();
        String jsonBody = json.toJson(employee1);
        System.out.println(jsonBody.toString());
    }
}
