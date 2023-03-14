package com.quid.carracing.component;

import java.util.Random;

public class Moveable {

    private static final Random random = new Random();

    public static boolean isMove() {
        return random.nextInt(10) >= 4;
    }
}