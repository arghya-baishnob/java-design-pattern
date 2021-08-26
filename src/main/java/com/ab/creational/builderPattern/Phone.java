package com.ab.creational.builderPattern;

public class Phone {
    private String os;
    private String processor;
    private String screenSize;
    private String battery;
    private String Camera;

    public Phone(String os, String processor, String screenSize, String battery, String camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        Camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", battery='" + battery + '\'' +
                ", Camera='" + Camera + '\'' +
                '}';
    }
}
