package com.github.designpatterns.behavioural.strategy;

import java.util.Collection;

public class BeautifulPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("***Beautiful Report***");
        orders.forEach(System.out::println);
        System.out.println("**********************");
    }
}
