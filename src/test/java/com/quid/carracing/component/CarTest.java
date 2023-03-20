package com.quid.carracing.component;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차 생성")
    public void makeCarTest() {
        String names = "제이,주니크,주니,쿠릉";

        List<Car> cars = Car.create(names);

        Assertions.assertEquals(cars.size(), 4);
    }

    @Test
    @DisplayName("자동차 이동")
    public void moveCarTest() {
        String names = "제이,주니크,주니,쿠릉";
        List<Car> cars = Car.create(names);
        Car car = cars.get(0);

        Assertions.assertDoesNotThrow(car::move);
    }
}
