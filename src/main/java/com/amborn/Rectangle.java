package com.amborn;

public class Rectangle implements Shape {
    private final Double side;

    public Rectangle(Double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return new Double(side*side);
    }

    @Override
    public Double circumference() {
        return 4 * side;
    }
}
