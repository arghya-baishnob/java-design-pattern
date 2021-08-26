package com.ab.creational.abstractFactoryPattern;

public class FactoryGenerator {
    public static DeviceFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case LAPTOP:
                return new LaptopFactory();
            case MOBILE:
                return new MobileFactory();
        }
        return null;
    }
}
