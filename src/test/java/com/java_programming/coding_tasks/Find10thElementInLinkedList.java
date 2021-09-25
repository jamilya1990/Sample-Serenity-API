package com.java_programming.coding_tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Find10thElementInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        System.out.println("list.get(9) = " + list.get(9));
        System.out.println("list.getLast() = " + list.getLast());

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5));
        stack.size();


    }
}
