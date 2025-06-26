package com.github.designpatterns.behavioural.strategy;

import java.util.List;

public class PrintService {

    private OrderPrinter orderPrinter;

    public PrintService(OrderPrinter orderPrinter) {
        this.orderPrinter = orderPrinter;
    }

    public void printOrders(List<Order> orders) {
        orderPrinter.print(orders);
    }
}
