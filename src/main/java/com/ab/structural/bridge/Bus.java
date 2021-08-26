package com.ab.structural.bridge;

public class Bus extends AutoMobile {

    public Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bus is - ");
        workshop1.work();
        workshop2.work();
    }
}
