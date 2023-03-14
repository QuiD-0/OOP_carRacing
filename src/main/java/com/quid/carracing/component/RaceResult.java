package com.quid.carracing.component;

import java.util.List;

public class RaceResult {

    private final List<Car> cars;

    private RaceResult(List<Car> cars) {
        this.cars = cars;
    }

    public static RaceResult of(List<Car> cars) {
        return new RaceResult(cars);
    }

    public List<Car> getWinner() {
        int maxPosition = getMaxPosition();
        return cars.stream()
            .filter(car -> car.isSamePosition(maxPosition))
            .toList();
    }

    private int getMaxPosition() {
        return cars.stream()
            .mapToInt(Car::position)
            .max()
            .orElseThrow(() -> new IllegalArgumentException("No cars"));
    }
}
