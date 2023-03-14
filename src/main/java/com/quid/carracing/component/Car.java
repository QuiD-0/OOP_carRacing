package com.quid.carracing.component;

import java.util.List;

public class Car {
    private final String name;
    private int position = 0;

    private Car(String name) {
        this.name = name;
    }

    public static List<Car> create(List<String> names) {
        return names.stream().map(Car::new).toList();
    }
}