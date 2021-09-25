package com.java_programming.collection;

public class Employee {
    private String name;
    private int id;
    private long salary;
    private String department;
    public Employee(int id, String name, long salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department =department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
