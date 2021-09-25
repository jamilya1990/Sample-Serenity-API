package com.java_programming.collection;

import java.util.*;

public class IterateOverList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "orange");
        for (
        Iterator iterator = list.iterator();
             iterator.hasNext();) {
            String each = (String) iterator.next();
            System.out.println(each);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
         String each = (String) iterator.next();
            System.out.println(each);
        }

        //iterate with stream + lambda
        list.stream().forEach(e-> System.out.println(e));

        //iterate with forEach + lambda
        list.forEach((e)-> System.out.println("items ->"+e));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"James",2000,"AB"));
        employees.add(new Employee(20,"Tom",1700,"BB"));
        employees.add(new Employee(30,"Peter",9000,"BC"));
        employees.add(new Employee(40,"Adam",1000,"AA"));

        Collections.sort(employees,new MySort());
        System.out.println(employees);
        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getId() - o2.getId());
            }
        });
        System.out.println(employees);

        Collections.sort(employees,(e1,o2) -> (o2.getId()-e1.getId()));
        System.out.println("final sort desc"+employees);

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("by name " +employees );

        List<String> fruits  = Arrays.asList("apple", "banana", "orange", "mango");

        //Collections.sort(fruits,Comparator.naturalOrder());
        Collections.sort(fruits);
        Collections.reverse(fruits);
        System.out.println(fruits);

    }
}

class MySort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o2.getSalary() - o1.getSalary());
    }
}
