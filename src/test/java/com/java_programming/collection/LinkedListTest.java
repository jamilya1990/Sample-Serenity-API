package com.java_programming.collection;



import com.vladsch.flexmark.util.collection.OrderedSet;
import io.cucumber.java.eo.Se;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListTest {
    public static void main(String[] args) {

        List<String> linkedList = new ArrayList<>(Arrays.asList("apple", "orange", "aplpe", "alepp", "grape"));
        Set<String> set = new TreeSet<>();
        List<String> sorted = new ArrayList<>();

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            char[] arr = fruit.toCharArray();
            Arrays.sort(arr);
            if(set.add(Arrays.toString(arr))){
                sorted.add(fruit);
            }
        }

       System.out.println(sorted);

        String[] arr = {"a", "a", "b", "b", "c"};
        Set<String> uniq = new TreeSet<>();

        uniq.addAll(Arrays.asList(arr));
        System.out.println(uniq);

        List<Integer> dupes = Arrays.asList(22,44,22,33,44,22,12,45);
        //HashSet will keep the order of insertion
      //  Set<Integer> noDupes = new HashSet<>();
        //TreeSet will sort ascending
       // noDupes.addAll(dupes);

        //System.out.println(noDupes);

        List<Integer> uniqList = dupes.stream().distinct().collect(Collectors.toList());
        //Object[] array = dupes.stream().distinct().toArray();

        //Compare if 2 multidimensional arrays are equal

        int[][] oneArr = {{1,2,34},
                          {45, 55, 14}};
        int[][] twoArr = {{1,2,34},
                          {45, 22, 14}};

        for (int i = 0, j=0; i < oneArr.length && j<twoArr.length; i++, j++) {
            for (int k = 0, l = 0; k < oneArr[i].length && l < twoArr[j].length; k++, l++) {
//                System.out.println(Arrays.asList(oneArr[i][k]));
//                System.out.println(Arrays.asList(twoArr[j][l]));
               if (oneArr[i][k]!=twoArr[j][l]){
                    System.out.println("not equal " + oneArr[i][k] + " != "+twoArr[j][l]);
                }

            }
        }
    }
}
