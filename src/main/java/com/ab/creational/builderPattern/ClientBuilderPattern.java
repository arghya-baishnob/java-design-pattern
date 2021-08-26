package com.ab.creational.builderPattern;

public class ClientBuilderPattern {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setProcessor("Snapdragon").build();
        System.out.println(phone);
    }
}
