package com.quid.carracing.component;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrinterTest {

    @Test
    @DisplayName("자동차 위치 출력")
    public void printCarPositionTest() {
        String names = "제이,주니크,주니,쿠릉";
        List<Car> car = Car.create(names);
        IntStream.range(0, 5)
            .forEach(i -> car.forEach(Car::move));

        Assertions.assertDoesNotThrow(() -> Announcer.announceRace(car));
    }

}
