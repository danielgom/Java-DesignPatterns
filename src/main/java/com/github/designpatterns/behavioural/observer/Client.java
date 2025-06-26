package com.github.designpatterns.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(50);
        order.addItem(179);
        order.addItem(500);
        order.addItem(39);
        order.addItem(399);
        order.addItem(22);

        System.out.println(order);
        System.out.println(order.getTotal());
    }
}
