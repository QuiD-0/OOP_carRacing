package com.quid.carracing.component;

import java.util.List;

public class Printer {

    public static void print(List<Car> car) {
        car.forEach(Printer::printPosition);
        System.out.println();
    }

    private static void printPosition(Car car) {
        System.out.println(car.name() + " : " + "-".repeat(car.position()));
    }

    public static void printWinner(RaceResult winner) {
        List<Car> winnerList = winner.getWinner();
        System.out.println("Winner : " + String.join(", ", winnerList.stream().map(Car::name).toList()));
    }
}
