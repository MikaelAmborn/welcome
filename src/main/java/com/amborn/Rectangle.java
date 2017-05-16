package com.amborn;


/**
 * This class represents a Rectangle shape.
 */
public class Rectangle implements Shape {
    private final Double side;

    /**
     * Rectangle constructor
     *
     * @param side The length of all sides of the Rectangle
     */
    public Rectangle(Double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The length of the side must be positive");
        }
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
