package com.ab.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Player terrorist = new Player("Terrorist");
        Player counterTerrorist = new Player("Counter-Terrorist");

        System.out.println("Before planting the Bomb !!  ----------------------------- ");
        terrorist.setStrategy(new AttackingStrategy());
        counterTerrorist.setStrategy(new DefensiveStrategy());
        terrorist.action();
        counterTerrorist.action();

        System.out.println("After planting the Bomb !! ----------------------------- ");
        terrorist.setStrategy(new DefensiveStrategy());
        counterTerrorist.setStrategy(new AttackingStrategy());
        terrorist.action();
        counterTerrorist.action();
    }
}
