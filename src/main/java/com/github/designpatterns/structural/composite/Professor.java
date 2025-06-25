package com.github.designpatterns.structural.composite;

public class Professor implements Faculty {
    private String mName;
    private String mPosition;
    private int mOfficeNumber;

    public Professor(String name, String mPosition, int mOfficeNumber) {
        this.mName = name;
        this.mPosition = mPosition;
        this.mOfficeNumber = mOfficeNumber;
    }

    @Override
    public String getDetails() {
        return mName + " is a " + mPosition + " at " + mOfficeNumber;
    }
}
