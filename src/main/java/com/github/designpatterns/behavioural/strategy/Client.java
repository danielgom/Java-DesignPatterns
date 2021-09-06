package com.github.designpatterns.behavioural.strategy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Client {

    private static final List<Order> orders = new LinkedList<>();

    public static void main(String[] args) {

        createOrders();

        PrintService printService = new PrintService(new SummaryPrinter());
        printService.printOrders(orders);
    }

    private static void createOrders() {

        Order order1 = new Order("1");
        order1.addItem("Soda", 2);
        order1.addItem("Chips", 10);
        orders.add(order1);

        Order order2 = new Order("1");
        order2.addItem("Cake", 24.99);
        order2.addItem("Chocolate pie", 9.99);
        orders.add(order2);

        Order order3 = new Order("1");
        order3.addItem("Taco", 2);
        order3.addItem("Burger", 12.99);
        orders.add(order3);
    }
}
