package com.github.designpatterns.behavioural.strategy;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("****** Summary Report ***********");

        AtomicReference<Double> total = new AtomicReference<>((double) 0);

        orders.forEach(order -> {
            System.out.println(order);
            total.getAndSet((total.get() + order.getTotal()));
        });
        System.out.println("Total: " + total.get());
    }
}
