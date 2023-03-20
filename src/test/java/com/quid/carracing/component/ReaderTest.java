package com.quid.carracing.component;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReaderTest {

    @Test
    @DisplayName("이름 입력")
    public void inputNameTest() {
        String input = "제이,주니크,주니,쿠릉\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader(scanner);
        String names = reader.readString();

        Assertions.assertEquals(names.length(), 12);
    }

    @Test
    @DisplayName("시도 횟수 입력")
    public void inputTryTest(){
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader(scanner);
        int count = reader.readInt();

        Assertions.assertEquals(count, 5);
    }

}
