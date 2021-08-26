package com.ab.behavioral.strategy;

public class DefensiveStrategy implements IStrategy {
    @Override
    public String actionCommand() {
        return "Defensive strategy, Protect Self !!!";
    }
}
