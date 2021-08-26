package com.ab.structural.facade;

public class ClientFacade {
    public static void main(String[] args) {

        // Without facade all complexity has on client side
        /*
        Food pasta = new Pasta();
        pasta.prepareFood(Ingredient.getPastaItems());
        System.out.println(pasta.deliverFood());

        Food pizza = new Pizza();
        pizza.prepareFood(Ingredient.getPizzaItems());
        System.out.println(pizza.deliverFood());
        */

        // With facade approach
        Waiter.deliverFood(FoodType.PASTA);
        Waiter.deliverFood(FoodType.PASTA);
    }
}
