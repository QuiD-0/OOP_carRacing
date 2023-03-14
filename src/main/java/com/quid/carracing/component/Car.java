package com.quid.carracing.component;

import java.util.List;

public class Car {

    private final String name;
    private int position = 0;

    private Car(String name) {
        this.name = name;
    }

    public static List<Car> create(List<String> names) {
        return names.stream().map(Car::new).toList();
    }

    public void move() {
        if(Moveable.isMove()) {
            position += 1;
        }
    }

    public String name() {
        return name;
    }

    public int position() {
        return position;
    }

    public boolean isSamePosition(int maxPosition) {
        return this.position == maxPosition;
    }
}