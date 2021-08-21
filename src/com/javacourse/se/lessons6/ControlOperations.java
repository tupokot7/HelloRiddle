package com.javacourse.se.lessons6;

public class ControlOperations {

    int a = 5, b = 7;
    boolean value = true;

    public void foo() {

        if(value) {
            System.out.println("True");
            // можно ещё добавлять if-ы но ну его нах... если много
            if(a < b) {
                System.out.println("Yes");
            }
        } else {                      //Здесь так-же можно ещё else if(..){...} else {..}, но ну его ...
            System.out.println("False");
        }
    }
}
