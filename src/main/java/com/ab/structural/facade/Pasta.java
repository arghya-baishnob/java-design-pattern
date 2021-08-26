package com.ab.structural.facade;

public class Pasta implements Food {
    private String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItem = "Tomato Pasts with ingredients " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return this.preparedItem + " -- is delivered !!";
    }
}
