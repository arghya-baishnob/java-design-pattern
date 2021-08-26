package com.ab.structural.flyweight;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        Vehicle cycle1 = VehicleFactory.getVehicle("Cycle");
        cycle1.assignColor("RED");
        cycle1.startEngine();

        Vehicle cycle2 = VehicleFactory.getVehicle("Cycle");
        cycle2.assignColor("BLUE");
        cycle2.startEngine();

        Vehicle truck1 = VehicleFactory.getVehicle("Truck");
        truck1.assignColor("BLACK");
        truck1.startEngine();

        Vehicle truck2 = VehicleFactory.getVehicle("Truck");
        truck2.assignColor("WHITE");
        truck2.startEngine();
    }
}
