package com.ab.creational.factoryPattern;

public class ClientFactoryPattern {
    public static void main(String[] args) {
        Laptop l1 = LaptopFactory.getLaptop(LaptopType.DELL);
        Laptop l2 = LaptopFactory.getLaptop(LaptopType.HP);

        System.out.println(l1);
        System.out.println(l2);
    }
}
