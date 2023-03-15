package com.quid.carracing;

import com.quid.carracing.component.Car;
import com.quid.carracing.component.Announcer;
import com.quid.carracing.component.Race;
import com.quid.carracing.component.RaceResult;
import com.quid.carracing.component.Register;
import java.util.List;

public class CarRacingApplication {

    public static void main(String[] args) {
        Register register = Register.create();
        List<Car> cars = register.racingCar();
        int count = register.raceCount();

        Race race = Race.ready(cars, count);
        RaceResult result = race.start();
        Announcer.announceWinner(result);
    }

}
