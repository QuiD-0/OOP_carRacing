package com.quid.carracing.component;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaceTest {

    @Test
    @DisplayName("레이스 준비")
    public void makeRaceTest() {
        List<Car> carList = Car.create(List.of("jay", "juniq", "junny", "쿠릉"));
        int count = 5;

        Assertions.assertNotNull(Race.ready(carList, count));
    }

    @Test
    @DisplayName("레이스 진행")
    public void startRaceTest(){
        List<Car> carList = Car.create(List.of("jay", "juniq", "junny", "쿠릉"));
        int count = 5;
        Race race = Race.ready(carList, count);

        Assertions.assertDoesNotThrow(race::start);
    }

}
