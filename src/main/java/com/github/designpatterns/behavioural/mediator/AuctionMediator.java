package com.github.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuctionMediator implements Mediator {
    private List<Buyer> buyers;

    public AuctionMediator() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        this.buyers.add(buyer);
        System.out.println("Buyer added to the list: " + buyer.name);
    }

    @Override
    public void findHighesBidder() {
        Buyer winner = this.buyers.stream()
                .peek(Buyer::endedAuction)
                .max(Comparator.comparingInt(buyer -> buyer.price))
                .orElseThrow(() -> new RuntimeException("No bidders for this auction"));

        System.out.println("The winner of the auction is: " + winner.name + " paid " + winner.price);
    }
}
