package com.java_programming.collection;

import javafx.collections.transformation.SortedList;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DecryptedMessage {



    public static List<String> test(String[] arr){

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        Set<String> eachWord = new HashSet<>();
        List<String> noAnagrams = new ArrayList<>();
        list.forEach(e -> {
            char[] word =e.toCharArray();
            Arrays.sort(word);
            if (eachWord.add(Arrays.toString(word))){
                noAnagrams.add(e);
            }
        });


//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String word = iterator.next();
//            char[] each = word.toCharArray();
//            Arrays.sort(each);
//            if(eachWord.add(Arrays.toString(each))){
//                noAnagrams.add(word);
//            }
//        }
        Collections.sort(noAnagrams);
        //or store everything in TreeSet<>() and no need to sort
        //System.out.println(noAnagrams);
        return noAnagrams;


    }

    public static void main(String[] args) {
        String[] arr = {"abcd", "cdba", "abcd", "bacd", "test", "tester"};
        System.out.println("test(arr) = " + test(arr));


        String str = "abcdefg";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += "" + str.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        String [] revArr = str.split("");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7-i; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
