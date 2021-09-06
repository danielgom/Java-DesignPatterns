package com.github.designpatterns.structural.adapter;

// New target interface required by the nec client code
public interface Customer {

    String getName();

    String getDestination();

    String getAddress();
}
