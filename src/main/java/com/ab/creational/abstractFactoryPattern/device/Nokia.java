package com.ab.creational.abstractFactoryPattern.device;

public class Nokia implements Device {
    private String ram;
    private String processor;

    public Nokia(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getConfiguration() {
        return "Nokia config RAM: " + this.ram + ", Processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "Nokia {" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
