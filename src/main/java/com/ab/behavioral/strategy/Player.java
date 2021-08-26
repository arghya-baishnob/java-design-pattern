package com.ab.behavioral.strategy;

public class Player {
    private IStrategy strategy;
    private String type;

    public Player(String type) {
        this.type = type;
    }

    public void setStrategy(IStrategy s) {
        this.strategy = s;
    }

    public void action() {
        System.out.println("Player: " + this.type + " - Strategy: " + this.strategy.actionCommand());
    }
}
