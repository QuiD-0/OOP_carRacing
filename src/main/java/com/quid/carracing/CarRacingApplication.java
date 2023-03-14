package com.quid.carracing;

import com.quid.carracing.component.Car;
import com.quid.carracing.component.Printer;
import com.quid.carracing.component.Race;
import com.quid.carracing.component.RaceResult;
import com.quid.carracing.component.Reader;
import java.util.List;

public class CarRacingApplication {

    public static void main(String[] args) {
        Reader input = new Reader();
        List<String> names = input.readName();
        List<Car> cars = Car.create(names);
        int count = input.readInt();
        Race race = Race.ready(cars, count);
        RaceResult result = race.start();
        Printer.printWinner(result);
    }

}
