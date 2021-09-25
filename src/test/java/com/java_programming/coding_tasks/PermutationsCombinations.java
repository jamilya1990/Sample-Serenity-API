package com.java_programming.coding_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PermutationsCombinations {
    // Java program to print all permutations of a
// given string.


    public static void main(String[] args) {
        String str = "ABC";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        permute(list, 0);
    }

    /**
     * permutation function
     *
     * @param list list to calculate permutation for
     * @param l    starting index
     */
    private static void permute(List<String> list, int l) {
        if (l == list.size() - 1) {
            String word = list.stream().map(e -> e + "").collect(Collectors.joining());
            System.out.println(word);

        }
        for (int i = l; i < list.size(); i++) {
            Collections.swap(list, i, l);
            permute(list, l + 1);
            Collections.swap(list, i, l);
        }
    }


}
