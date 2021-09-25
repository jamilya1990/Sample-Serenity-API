package com.java_programming.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc", "dfg", "abcc"));
        list.forEach(e -> System.out.println(e));

    }
}
