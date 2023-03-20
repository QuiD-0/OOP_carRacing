package com.quid.carracing.component;

import java.util.Scanner;

public class Reader {

    private final Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[error] Please enter a number");
            }
        }
    }
}