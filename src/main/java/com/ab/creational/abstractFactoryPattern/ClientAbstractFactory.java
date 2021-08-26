package com.ab.creational.abstractFactoryPattern;

import com.ab.creational.abstractFactoryPattern.device.Device;
import com.ab.creational.abstractFactoryPattern.device.DeviceType;
import com.ab.creational.abstractFactoryPattern.device.Nokia;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOP).getDevice(DeviceType.DELL);
        System.out.println(dell.getConfiguration());

        Device nokia = FactoryGenerator.getFactory(FactoryType.MOBILE).getDevice(DeviceType.NOKIA);
        System.out.println(nokia.getConfiguration());
    }
}
