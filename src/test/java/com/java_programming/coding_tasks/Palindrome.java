package com.java_programming.coding_tasks;

import org.yecht.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        String str = "Mr. Owl ate my metal worm";
        String noSpaces ="";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
                noSpaces += ""+str.charAt(i);
            }
        }
        System.out.println(noSpaces);

        StringBuilder sb = new StringBuilder(noSpaces);

        StringBuilder reverse = sb.reverse();
        if (reverse.toString().equalsIgnoreCase(noSpaces)){
            System.out.println(reverse+" = " + noSpaces);
        }

    }

}
