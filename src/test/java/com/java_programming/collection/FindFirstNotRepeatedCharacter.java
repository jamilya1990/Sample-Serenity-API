package com.java_programming.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstNotRepeatedCharacter {

    /**
     * // Your choice:
     *
     * //Option 1:
     * // for any string, find the first non-repeating character
     * // for example 'llama' -> m
     * // for 'hello' -> 'h'
     * // for 'ababc' -> 'c'
     */

    public static void main(String[] args) {
        String word = "ababc";

        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    index++;
                }
            }
            if (index==1){
                System.out.println(word.charAt(i));
            }
        }

        List<String> list = new ArrayList<>(Arrays.asList(word.split("")));
        System.out.println(list);
        list.stream().forEach(e->{
            if(Collections.frequency(list, e)==1){
                System.out.println(e);
            }
        });
    }
}
