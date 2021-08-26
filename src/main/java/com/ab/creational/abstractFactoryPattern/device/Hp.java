package com.ab.creational.abstractFactoryPattern.device;

public class Hp implements Device {
    private String ram;
    private String processor;
    private String gpu;

    public Hp(String ram, String processor, String gpu) {
        this.ram = ram;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String getConfiguration() {
        return "Dell config RAM: " + this.ram + ", Processor: " + this.processor + ", GPU: " + this.gpu;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
