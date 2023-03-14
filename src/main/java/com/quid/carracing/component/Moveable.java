package com.quid.carracing.component;

import java.util.Random;

public class Moveable {

    public static boolean isMove() {
        Random random = new Random();
        return random.nextInt(10) >= 4;
    }
}