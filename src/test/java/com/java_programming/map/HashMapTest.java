package com.java_programming.map;

import com.google.common.collect.ForwardingSortedMap;
import io.cucumber.java.it.Ma;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("entry.getValue() = " + entry.getValue());
//            System.out.println("entry.getKey() = " + entry.getKey());
//        }
////        List<Integer> list = (List<Integer>) map.values();
//        Collection<Integer> values = map.values();
//
//        //iterate using forEach() method:
//        map.forEach((K, V)-> {
//            System.out.println(K);
//        });
//
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println("entry.getKey() = " + entry.getKey());
//            System.out.println("entry.getValue() = " + entry.getValue());
//        }

        map.entrySet().forEach((Map.Entry<String,Integer> e)-> System.out.println(e.getKey()));

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println("map.values() = " + map.values());
        System.out.println("map.entrySet() = " + map.entrySet());
        //map.forEach((key, value) -> e.getKey());
        Collection<Integer> values = map.values();

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("a",1);
        map2.put("b",2);
        map2.put("c",3);
        map2.put("d",4);
        //map2.put("e",5);

        System.out.println(map.entrySet().equals(map2.entrySet()));
        map.remove("a");
        map.remove("a",1);

        //reverse map
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        sortedMap.put("a",1);
        sortedMap.put("c",3);
        sortedMap.put("d",4);
        sortedMap.put("b",2);
        System.out.println(sortedMap);


        SortedMap<String, Integer> reversedMap = new TreeMap<>(sortedMap).descendingMap();
        System.out.println(reversedMap);

        System.out.println("reversedMap.firstKey() = " + reversedMap.firstKey());
        System.out.println("reversedMap.get(reversedMap.firstKey()) = " + reversedMap.get(reversedMap.firstKey()));

        Set<String> entry = reversedMap.keySet();
        entry.forEach(e-> {
            if(e.equals("a")){
                System.out.println("e = " + e);
            }

        });

       // get the key
        for (Map.Entry<String, Integer> each : reversedMap.entrySet()) {
            System.out.println("each.getKey() = " + each.getKey());
        }

        reversedMap.entrySet().forEach((Map.Entry<String,Integer> e) -> System.out.println(e.getKey()) );

        reversedMap.get("a");

        for (Map.Entry<String, Integer> eachEntry : reversedMap.entrySet()) {
            if (eachEntry.getKey().contains("c")){
                System.out.println(eachEntry.getValue());
            }
        }

    }
}
