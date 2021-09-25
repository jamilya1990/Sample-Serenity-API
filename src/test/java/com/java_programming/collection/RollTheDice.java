package com.java_programming.collection;

import io.cucumber.java.sl.In;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class RollTheDice {

    /**
     * 1. Let's create a game where we roll a die, and move a player around a game board.
     * The board has 40 spaces, arranged in a circle
     * <p>
     * The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
     * - roll the die (each die has a random value, 1-6)
     * - print player start position, die value, and ending position
     * <p>
     * sample output:
     * <p>
     * //     start=0, roll=3, end=3
     * //     start=3, roll=2, end=5
     * //     ...
     * //     start=38, roll=6, end=4
     */

    //die = 1...6
    //board -> circle 1...40
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 7;
        int start;
        int end = 0;

        for (int i = 0; i < 30; i++) {
            int die = random.nextInt(min + max) + min;
            start = end;
            if (start >= 40) {
                start = start - 40;
            }
            System.out.println("start = " + start);
            System.out.println("roll = " + die);
            end = start + die;
            System.out.println("end = " + end);


        }
    }
}
