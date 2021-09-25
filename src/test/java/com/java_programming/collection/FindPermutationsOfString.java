package com.java_programming.collection;

import java.util.ArrayList;
import java.util.List;

public class FindPermutationsOfString {
/** // Find all permutations of a string. Allow duplicates.
 * // for example, 'ab' -> 'ab', 'ba'
 * // for 'abc' -> 'abc', 'bca', 'bac', 'cab', 'acb', and 'cba'
 * // for 'abb' -> 'abb', 'abb', 'bab', 'bab', 'bba', and 'bba'
 */
public static void main(String[] args) {

    String word = "abc";
    String[] arr = word.split("");
    List<String> list = new ArrayList<>();

    int index = 0;
        String str = "";
//    for (int i = 0; i <word.length(); i++) {
//        str += word.charAt(i)+""+loop();
//        while (i<word.length()){
//            str += loop(word,)
//        }
  //  }
    //System.out.println(list);

}
public static char loop(String word, int i){


    return word.charAt(i);
}
}
