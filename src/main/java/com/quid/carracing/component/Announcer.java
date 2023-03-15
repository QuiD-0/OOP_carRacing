package com.quid.carracing.component;

import java.util.List;

public class Announcer {

    public static void announceRace(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.name() + " : " + "-".repeat(car.position()));
        }
        System.out.println();
    }

    public static void announceWinner(RaceResult result) {
        List<Car> winnerList = result.getWinner();
        System.out.println("Winner : " + String.join(", ", winnerList.stream().map(Car::name).toList()));
    }
}
