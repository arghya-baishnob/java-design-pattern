package com.ab.structural.bridge;

public abstract class AutoMobile {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected AutoMobile(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract public void manufacture();
}
