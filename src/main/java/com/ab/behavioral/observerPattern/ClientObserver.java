package com.ab.behavioral.observerPattern;

public class ClientObserver {
    public static void main(String[] args) {
        Chanel c = new Chanel();
        c.setChannelName("ABC");

        for (int i = 0; i < 10 ; i++) {
            Subscriber s = new Subscriber("S" + i);
            s.setChanel(c);
            c.subscribe(s);
        }

       // System.out.println(c.getSubscribers());
        c.notifySub();
    }
}
