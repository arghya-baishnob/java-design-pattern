package com.ab.behavioral.observerPattern;

public class Subscriber {
    private String name;
    private Chanel chanel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println(name + " got updated from: " + getChanel().getChannelName());
    }

    public Chanel getChanel() {
        return chanel;
    }

    public void setChanel(Chanel chanel) {
        this.chanel = chanel;
    }
}
