package com.quid.carracing.component;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrinterTest {

    @Test
    @DisplayName("자동차 위치 출력")
    public void printCarPositionTest() {
        List<Car> car = Car.create(List.of("jay", "juniq", "junny", "쿠릉"));
        IntStream.range(0, 5)
            .forEach(i -> car.forEach(Car::move));

        Announcer.announceRace(car);
    }

}
