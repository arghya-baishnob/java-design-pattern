package com.ab.structural.flyweight;

public class Cycle implements Vehicle {
    private final String MAX_SPEED; // Intrinsic property
    private String color;

    public Cycle() {
        MAX_SPEED = "15km/hr";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " coloured Cycle with max speed of: " + MAX_SPEED);
    }
}
