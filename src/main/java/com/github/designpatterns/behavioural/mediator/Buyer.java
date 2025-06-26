package com.github.designpatterns.behavioural.mediator;

public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    protected Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void endedAuction();
}
