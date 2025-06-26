package com.github.designpatterns.behavioural.chainofresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
