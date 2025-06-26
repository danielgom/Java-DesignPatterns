package com.github.designpatterns.behavioural.mediator;

public class AuctionBuyer extends Buyer {
    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }

    @Override
    public void endedAuction() {
        System.out.println("Auction ended for " + this.name);
    }
}
