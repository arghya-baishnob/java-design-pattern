package com.ab.structural.bridge;

public class Taxi extends AutoMobile {

    public Taxi(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Taxi is - ");
        workshop1.work();
        workshop2.work();
    }
}
