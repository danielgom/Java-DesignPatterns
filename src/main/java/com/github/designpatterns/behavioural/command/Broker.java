package com.github.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        this.orders.add(order);
    }

    public void placeOrders() {
        this.orders.forEach(Order::execute);
        this.orders.clear();
    }
}
