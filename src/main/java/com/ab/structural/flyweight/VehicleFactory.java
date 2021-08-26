package com.ab.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static Map<String, Vehicle> vehicles = new HashMap<>();

    public static Vehicle getVehicle(String type) throws IllegalAccessException {
        Vehicle vehicle;

        if (vehicles.containsKey(type)) {
            vehicle = vehicles.get(type);
        } else {
            switch (type) {
                case "Cycle":
                    vehicle = new Cycle();
                    System.out.println("New Cycle is Created !!");
                    break;
                case "Truck":
                    vehicle = new Truck();
                    System.out.println("New Truck is created !!");
                    break;
                default:
                    throw new IllegalAccessException("Invalid type");
            }
            vehicles.put(type, vehicle);
        }
        return vehicle;
    }
}
