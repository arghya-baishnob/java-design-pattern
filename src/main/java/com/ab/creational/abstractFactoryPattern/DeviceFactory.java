package com.ab.creational.abstractFactoryPattern;

import com.ab.creational.abstractFactoryPattern.device.Device;
import com.ab.creational.abstractFactoryPattern.device.DeviceType;

public interface DeviceFactory {
    Device getDevice(DeviceType deviceType);
}
