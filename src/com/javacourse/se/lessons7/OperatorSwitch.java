package com.javacourse.se.lessons7;

public class OperatorSwitch {

    final int VALUE = 1, FIRSTNAME = 1, SECONDLY = 4, THIRDLY = 3;
//    int value = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo() {
         // Оператор множественного выбора.
         // byte, short, int, char, String

//        switch (48) {
//            case 25:
//                System.out.println(25);
//                break;
//            case 73:
//                System.out.println(73);
//                break;
//            case 48:
//                System.out.println(48);
//                break;
//            default:
//                System.out.println("Not found");


        switch (VALUE) {
            case FIRSTNAME:
                System.out.println(FIRSTNAME);
                break;
            case SECONDLY:
                System.out.println(SECONDLY);
                break;
            case THIRDLY:
                System.out.println(THIRDLY);
            default:
                System.out.println("Default!");
        }
    }
}
