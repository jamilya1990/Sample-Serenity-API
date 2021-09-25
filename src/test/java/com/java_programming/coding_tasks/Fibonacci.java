package com.java_programming.coding_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        fib(60);


    }
    public static void fib(int lastIndex){

        int[] arr = new int[lastIndex];
        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i < lastIndex; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=lastIndex){
                System.out.println(arr[i]);
            }else{
                break;
            }
        }

    }
}
