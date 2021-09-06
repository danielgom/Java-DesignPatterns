package com.github.designpatterns.behavioural.strategy;

import java.util.Collection;

// Strategy
public interface OrderPrinter {

    void print(Collection<Order> orders);
}
