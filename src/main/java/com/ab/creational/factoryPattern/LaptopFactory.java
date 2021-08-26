package com.ab.creational.factoryPattern;

public class LaptopFactory {
    public static Laptop getLaptop(LaptopType type) {
        switch (type) {
            case HP:
                return new Hp("6GB", "i3");
            case DELL:
                return new Dell("8GB", "i5");
        }
        return null;
    }
}
