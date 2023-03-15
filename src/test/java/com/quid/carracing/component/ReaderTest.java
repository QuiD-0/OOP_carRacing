package com.quid.carracing.component;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReaderTest {

    @Test
    @DisplayName("이름 입력")
    public void inputNameTest() {
        String input = "jay,juniq,junny,jureung\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Register reader = new Register(scanner);
        List<Car> cars = reader.racingCar();

        Assertions.assertEquals(cars.size(), 4);
    }

    @Test
    @DisplayName("시도 횟수 입력")
    public void inputTryTest(){
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Register reader = new Register(scanner);
        int count = reader.raceCount();

        Assertions.assertEquals(count, 5);
    }

}
