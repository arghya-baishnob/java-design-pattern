package com.ab.structural.facade;

public class Pizza implements Food {
    private String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItem = "Thin Crust Pizza with ingredients " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return this.preparedItem + " -- is delivered !!";
    }
}
