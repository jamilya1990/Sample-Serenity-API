package com.java_programming.coding_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {
        String[] arr = {"abc", "abcd", "bbbc", "cdbd"};
//Reverse Array
        //Method 1:
        String[] reversed = new String[arr.length];

        for (int i = arr.length-1, j=0; i >=0; j++, i--) {
            reversed[j] = arr[i];
        }
        System.out.println("Arrays.toString(reversed) = " + Arrays.toString(reversed));

        //Method 2:

        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] reversedArr = list.toArray(arr);
        System.out.println(Arrays.toString(reversedArr));



    }
}
