package com.java_programming.coding_tasks;

public class FindMissingNumberFromArray {
    /**
     * Interview java task find missing number from array
     * int [] arr= {1,2,3,4,6,7} all numbers are in sequence
     */
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,6,7, 9,10};

//        int index = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=index){
//                System.out.println(arr[i] + " != "+index);
//                break;
//            }
//            index++;
//        }

        //OR

        for (int i = 1; i < arr.length; i++) {
            if (++arr[i-1] != arr[i]){
                System.out.println(arr[i-1]);
            }
        }

        //OR

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-arr[i-1]>1){
                System.out.println(arr[i-1]);
            }
        }
    }
}
