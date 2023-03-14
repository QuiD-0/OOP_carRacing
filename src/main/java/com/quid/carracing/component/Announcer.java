package com.quid.carracing.component;

import java.util.List;

public class Announcer {

    public static void print(List<Car> car) {
        car.forEach(Announcer::printPosition);
        System.out.println();
    }

    private static void printPosition(Car car) {
        System.out.println(car.name() + " : " + "-".repeat(car.position()));
    }

    public static void announceWinner(RaceResult result) {
        List<Car> winnerList = result.getWinner();
        System.out.println("Winner : " + String.join(", ", winnerList.stream().map(Car::name).toList()));
    }
}
