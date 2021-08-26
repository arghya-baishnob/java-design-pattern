package com.ab.behavioral.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Chanel {
    private String channelName;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unSubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySub() {
        subscribers.stream().forEach(s -> {
            s.update();
        });
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }
}
