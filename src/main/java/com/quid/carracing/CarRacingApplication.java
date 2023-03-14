package com.quid.carracing;

import com.quid.carracing.component.Reader;
import java.util.List;

public class CarRacingApplication {

    public static void main(String[] args) {
        Reader reader = new Reader();
        List<String> names = reader.readName();
    }

}
