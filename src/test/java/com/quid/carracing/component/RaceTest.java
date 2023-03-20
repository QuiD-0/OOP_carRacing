package com.quid.carracing.component;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaceTest {

    @Test
    @DisplayName("레이스 준비")
    public void makeRaceTest() {
        String names = "제이,주니크,주니,쿠릉";
        List<Car> cars = Car.create(names);
        int count = 5;

        Assertions.assertNotNull(Race.ready(cars, count));
    }

    @Test
    @DisplayName("레이스 진행")
    public void startRaceTest(){
        String names = "제이,주니크,주니,쿠릉";
        List<Car> cars = Car.create(names);
        int count = 5;
        Race race = Race.ready(cars, count);

        Assertions.assertDoesNotThrow(race::start);
    }

}
