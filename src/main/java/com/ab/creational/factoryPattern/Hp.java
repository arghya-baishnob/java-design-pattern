package com.ab.creational.factoryPattern;

public class Hp implements Laptop {
    private String ram;
    private String processor;

    public Hp(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getConfiguration() {
        return "HP config RAM: " + this.ram + ", Processor: " + this.processor;
    }

    @Override
    public String toString() {
        return "Hp {" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
