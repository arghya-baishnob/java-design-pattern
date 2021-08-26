package com.ab.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable {

    private List<String> defaultFlights;

    public Flight() {
        this.defaultFlights = new ArrayList<>();
    }

    public Flight(List<String> defaultFlights) {
        this.defaultFlights = defaultFlights;
    }

    public void loadDefaultFlights() {
        defaultFlights.add("AA");
        defaultFlights.add("BB");
        defaultFlights.add("CC");
    }

    public List<String> getDefaultFlights() {
        return this.defaultFlights;
    }

    @Override
    public Object clone() {
        List<String> flights = new ArrayList<>();
        getDefaultFlights().stream().forEach(f -> {
            flights.add(f);
        });
        return new Flight(flights);
    }
}
