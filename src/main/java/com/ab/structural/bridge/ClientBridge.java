package com.ab.structural.bridge;

public class ClientBridge {
    public static void main(String[] args) {
        AutoMobile bus = new Bus(new Produce(), new Assemble());
        AutoMobile taxi = new Taxi(new Produce(), new Assemble());

        bus.manufacture();
        taxi.manufacture();
    }
}
