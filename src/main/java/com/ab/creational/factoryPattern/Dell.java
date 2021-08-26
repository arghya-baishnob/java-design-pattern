package com.ab.creational.factoryPattern;

public class Dell implements Laptop {
    private String ram;
    private String processor;

    public Dell(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getConfiguration() {
        return "Dell config RAM: " + this.ram + ", Processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "Dell {" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
