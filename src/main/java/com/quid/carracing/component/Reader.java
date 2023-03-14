package com.quid.carracing.component;

import java.util.List;
import java.util.Scanner;

public class Reader {

    public List<String> readName() {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }

        return List.of(input.split(","));
    }

    public int readInt() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
