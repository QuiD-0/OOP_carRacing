package com.quid.carracing.component;

import java.io.ByteArrayInputStream;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReaderTest {

    private Reader reader;

    @Test
    @DisplayName("이름 입력")
    public void inputNameTest() {
        String input = "jay,juniq,junny,jureung\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        reader = new Reader();
        List<String> names = reader.readName();

        Assertions.assertEquals(names.size(), 4);
    }

    @Test
    @DisplayName("시도 횟수 입력")
    public void inputTryTest(){
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        reader = new Reader();
        int count = reader.readInt();

        Assertions.assertEquals(count, 5);
    }

}
