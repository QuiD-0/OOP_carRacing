package com.quid.carracing;

import com.quid.carracing.component.Announcer;
import com.quid.carracing.component.Car;
import com.quid.carracing.component.Race;
import com.quid.carracing.component.RaceResult;
import com.quid.carracing.component.Reader;
import java.util.List;
import java.util.Scanner;

public class CarRacingApplication {

    public static void main(String[] args) {
        Reader reader = new Reader(new Scanner(System.in));
        String names = reader.readString();
        int count = reader.readInt();

        List<Car> carList = Car.create(names);
        Race race = Race.ready(carList, count);
        RaceResult result = race.start();
        Announcer.announceWinner(result);
    }

}
