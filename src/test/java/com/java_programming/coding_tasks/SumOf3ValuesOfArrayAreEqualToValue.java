package com.java_programming.coding_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOf3ValuesOfArrayAreEqualToValue {
    public static void main(String[] args) {
        int[] arr = {3,7,1,2,8,4,5};
        int value = 20;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==value){
                        System.out.println(""+arr[i]+arr[j]+arr[k] +" = 20");
                    }
                }
            }
        }

    }
}
