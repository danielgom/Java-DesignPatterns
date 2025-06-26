package com.github.designpatterns.behavioural.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();
        Buyer buyer1 = new AuctionBuyer(mediator, "Buyer 1");
        Buyer buyer2 = new AuctionBuyer(mediator, "Buyer 2");
        Buyer buyer3 = new AuctionBuyer(mediator, "Buyer 3");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        buyer1.bid(100);
        buyer2.bid(150);
        buyer3.bid(200);

        mediator.findHighesBidder();
    }
}
