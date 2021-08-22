package com.javacourse.se.lessons8;

public class LoopControl {

    boolean value = true;
    int a = 5, b = 7;

    public void foo() {
        // do while, что бы цикл выполнился хотя бы один раз
        do {
            a++;
            System.out.println(a);
        } while (a < b);

//        while (a < b) {
//            System.out.println(a);
//            a++;
        }
    }
