package com.ab.creational.abstractFactoryPattern;

import com.ab.creational.abstractFactoryPattern.device.Device;
import com.ab.creational.abstractFactoryPattern.device.DeviceType;
import com.ab.creational.abstractFactoryPattern.device.*;

import static com.ab.creational.abstractFactoryPattern.device.DeviceType.HP;

public class LaptopFactory implements DeviceFactory {

    @Override
    public Device getDevice(DeviceType deviceType) {
        switch (deviceType) {
            case HP:
                return new Hp("6GB", "i3", "113");
            case DELL:
                return new Dell("8GB", "i5", "115");
        }
        return null;
    }
}
