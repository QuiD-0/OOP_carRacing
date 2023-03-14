package com.quid.carracing.component;

import java.util.List;
import java.util.Scanner;

public class Reader {

    private final Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Reader(){
        this.scanner = new Scanner(System.in);
    }

    public List<String> readName() {
        return List.of(scanner.nextLine().split(","));
    }

    public int readInt() {
        return scanner.nextInt();
    }
}
