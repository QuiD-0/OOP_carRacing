package com.quid.carracing.component;

import java.util.List;
import java.util.stream.IntStream;

public class Race {

    private final List<Car> cars;
    private final int count;

    private Race(List<Car> cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public static Race ready(List<Car> cars, int count) {
        return new Race(cars, count);
    }

    public RaceResult start() {
        IntStream.range(0, count)
            .forEach(i -> {
                cars.forEach(Car::move);
                Announcer.announceRace(cars);
            });
        return RaceResult.of(cars);
    }
}
