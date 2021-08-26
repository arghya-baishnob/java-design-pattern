package com.ab.creational.prototype;

public class ClientPrototype {
    public static void main(String[] args) {
        Flight f1 = new Flight();
        f1.loadDefaultFlights();

        Flight f2 = (Flight)f1.clone();
        f2.getDefaultFlights().add("DD");

        Flight f3 = (Flight)f1.clone();
        f3.getDefaultFlights().add("EE");

        printFlights(f1);
        printFlights(f2);
        printFlights(f3);
    }

    private static void printFlights(Flight flight) {
        flight.getDefaultFlights().forEach(System.out::println);
        System.out.println("---------------------------------");
    }
}
