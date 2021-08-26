package com.ab.creational.abstractFactoryPattern;

import com.ab.creational.abstractFactoryPattern.device.Device;
import com.ab.creational.abstractFactoryPattern.device.DeviceType;
import com.ab.creational.abstractFactoryPattern.device.Nokia;

public class MobileFactory implements DeviceFactory {
    @Override
    public Device getDevice(DeviceType deviceType) {
        switch (deviceType) {
            case NOKIA:
                return new Nokia("6gb", "snapdargon");
            case SAMSUNG:
                return new Nokia("8gb", "helix");
        }
        return null;
    }
}
