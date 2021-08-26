package com.ab.creational.abstractFactoryPattern.device;

public class Samsung implements Device {
    private String ram;
    private String processor;

    public Samsung(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getConfiguration() {
        return "Samsung config RAM: " + this.ram + ", Processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "Samsung {" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
