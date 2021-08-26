package com.ab.creational.singleton;

public class ClientSingleton {
    public static void main(String[] args) {
        Flight f1 = Flight.getFLight();
        f1.getDefaultFlights().forEach(System.out::println);
    }
}
