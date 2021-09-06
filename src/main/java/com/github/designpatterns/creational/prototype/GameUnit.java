package com.github.designpatterns.creational.prototype;

import javafx.geometry.Point3D;

// Prototype needs to implement cloneable interface

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove.multiply(distance);
        this.position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return this.position;
    }

    @Override
    public GameUnit clone() {
        try {
            GameUnit unit = (GameUnit) super.clone();
            unit.initialize();
            return unit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

}
