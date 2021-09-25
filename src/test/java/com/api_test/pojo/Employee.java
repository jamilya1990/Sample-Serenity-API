package com.api_test.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.yecht.Data;

@Getter
@Setter
@ToString
public class Employee {

    private String firstName;
    private String lastName;
    private int jobId;

    public Employee(String firstName, String lastName, int jobId){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setJobId(jobId);
    }

    public Employee() {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setJobId(jobId);
    }
}
