package com.ab.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private static Flight flight;
    private final List<String> defaultFlights;

    private Flight() {
        defaultFlights = new ArrayList<>();
    }

    public static Flight getFLight() {
        if (flight == null) {
            flight = buildFlight();
        }
        return flight;
    }

    private static Flight buildFlight() {
        Flight f = new Flight();
        f.loadDefaultFlights();
        return f;
    }

    private void loadDefaultFlights() {
        defaultFlights.add("AA");
        defaultFlights.add("BB");
        defaultFlights.add("CC");
    }

    public List<String> getDefaultFlights() {
        return defaultFlights;
    }
}
