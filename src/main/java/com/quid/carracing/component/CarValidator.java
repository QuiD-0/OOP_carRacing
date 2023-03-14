package com.quid.carracing.component;

public class CarValidator {

    public static void validate(Car car) {
        if (car.name().isEmpty()) {
            throw new IllegalArgumentException("Car name must not be empty");
        }
        if (car.name().length() > 5) {
            throw new IllegalArgumentException("Car name must be less than 5 characters");
        }
    }
}
