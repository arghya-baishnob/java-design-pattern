package com.ab.creational.builderPattern;

public class PhoneBuilder {
    private String os;
    private String processor;
    private String screenSize;
    private String battery;
    private String Camera;

    public Phone build() {
        return new Phone(os, processor, screenSize, battery, Camera);
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        Camera = camera;
        return this;
    }
}
