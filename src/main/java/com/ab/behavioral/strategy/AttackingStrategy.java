package com.ab.behavioral.strategy;

public class AttackingStrategy implements IStrategy {
    @Override
    public String actionCommand() {
        return "Attacking Strategy, Find & Kill opponent";
    }
}
