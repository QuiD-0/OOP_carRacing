package com.quid.carracing.component;

import java.util.List;
import java.util.Scanner;

public class Register {

    private final Scanner scanner;

    public Register(Scanner scanner) {
        this.scanner = scanner;
    }

    private Register() {
        this.scanner = new Scanner(System.in);
    }

    public static Register create() {
        return new Register();
    }

    public List<Car> racingCar() {
        List<String> names = List.of(scanner.nextLine().split(","));
        return Car.create(names);
    }

    public int raceCount() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[error] Please enter a number");
            }
        }
    }
}
