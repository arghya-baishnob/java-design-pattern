package com.ab.structural.bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.print("Assembled. \n");
    }
}
