package com.java_programming.coding_tasks;

import io.cucumber.java.en.Given;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PermutationCombo_V2 {

//    Given an array of 3 characters print all permutation combinations from the given characters
//   for example : [a, b, c]
//            5! = 54321 = 120
//    expected result :
//
//            [a, b, c]
//            [a, c, b]
//            [b, a, c]
//            [b, c, a]
//            [c, a, b]
//            [c, b, a]



    public static void permutations(List<String> list, int L) {

        if (L == list.size() - 1) { // true
            System.out.println(list); // ABC , ACB, BAC, BCA , CAB, CBA
            return;
        }

        for (int i = L; i < list.size(); i++) {


            Collections.swap(list, i, L);// swap(A,B) -> CBA
            permutations(list, L+1);
            // I started a new process

            Collections.swap(list, i, L);// CAB -> (C,B) -> BAC

        }
        // After Loop
    }

    public static void main(String[] args) { // p1
        long startTime = System.nanoTime();
        String[] s = {"A", "B", "C", "D", "E", "F", "G", "H"};
        List<String> a = new LinkedList<>();

        for (String each : s) {
            a.add(each);
        }

        permutations(a, 0);// level 0
        // start new process


    }

}

