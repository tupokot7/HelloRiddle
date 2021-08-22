package com.javacourse.se.lessons9;

public class ForLoop {

//    public void foo() {
//
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }

    int [] array = {1, 2, 3};

    public void foo() {

        for(int element: array) {
            System.out.println(element);
        }
    }
}
