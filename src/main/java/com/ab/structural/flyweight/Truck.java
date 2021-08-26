package com.ab.structural.flyweight;

public class Truck implements Vehicle {

    private final String MAX_SPEED; // Intrinsic property
    private String color;

    public Truck() {
        MAX_SPEED = "120km/hr";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " coloured Truck with max speed of: " + MAX_SPEED);
    }
}
