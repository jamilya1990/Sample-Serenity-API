package com.java_programming.coding_tasks;

import io.cucumber.java.sl.In;

interface Ink{
    static void pen(){
        System.out.println("Interface static method");
    }
}

class SHLtests implements Ink {

public void pen(){
    System.out.println("Class implemented Interface");
}

}

class MainTest{
    public static void main(String[] args) {

    }
}
