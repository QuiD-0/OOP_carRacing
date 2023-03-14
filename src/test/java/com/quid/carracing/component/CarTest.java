package com.quid.carracing.component;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void makeCarTest() {
        List<String> names = List.of("jay", "juniq", "junny", "jureung");

        List<Car> cars = Car.create(names);

        Assertions.assertEquals(cars.size(), 4);
    }
}
