package com.gmail.granovskiy;

public final class ImmutablePoint {
    //  description of class properties
    private final double x;
    private final double y;
    //  constructor
    public ImmutablePoint(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    //  getter methods to get values of properties
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    //  method to String
    @Override
    public String toString() {
        return "ImmuatablePoint [x=" + x + ", y=" + y + "]";
    }
}
