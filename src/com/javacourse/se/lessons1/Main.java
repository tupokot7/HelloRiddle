package com.javacourse.se.lessons1;

import com.javacourse.se.lessons3.Bus;

public class Main {
    public static void main(String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
