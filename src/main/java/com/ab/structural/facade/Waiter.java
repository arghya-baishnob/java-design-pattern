package com.ab.structural.facade;

// It will work like a facade to customer
public class Waiter {
    public static String deliverFood(FoodType foodType) {
        switch (foodType) {
            case PIZZA:
                Food pizza = new Pizza();
                pizza.prepareFood(Ingredient.getPizzaItems());
                return pizza.deliverFood();
            case PASTA:
                Food pasta = new Pasta();
                pasta.prepareFood(Ingredient.getPastaItems());
                return pasta.deliverFood();
            default:
                return "No order Specified !!!";
        }
    }
}
