package com.github.designpatterns.creational.prototype;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                "@ " + getPosition() +
                '}';
    }

    @Override
    public GameUnit clone() {
        throw new AssertionError("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("reset is not supported");
    }
}
