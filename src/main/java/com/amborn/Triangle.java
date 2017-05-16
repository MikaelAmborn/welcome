package com.amborn;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a Triangle shape.
 */
public class Triangle implements Shape {
    private final static Double NOT_SET = Double.NEGATIVE_INFINITY;
    private final Double side1;
    private final Double side2;
    private final Double side3;
    private final Double base;
    private final Double height;

    /**
     * Create a right angled triangle giving the length of the three sides.
     *
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @param side3 The length of the third side.
     * @return A new Triangle
     */
    public static Triangle CreateRightAngledTriangle(Double side1, Double side2, Double side3) {
        return new Triangle(side1, side2, side3, NOT_SET, NOT_SET);
    }

    /**
     * Create a triangle giving an explicit base and height.
     *
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @param side3 The length of the third side.
     * @param base The length of the base of the triangle.
     * @param height The lenght of the height of the triangle.
     * @return A new Triangle
     */
    public static Triangle CreateTriangle(Double side1, Double side2, Double side3, Double base, Double height) {
        return new Triangle(side1, side2, side3, base, height);
    }

    private Triangle(Double side1, Double side2, Double side3, Double base, Double height) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("The length of all sides must be set to positive values");
        }
        if ((base != NOT_SET && base <= 0) || (height != NOT_SET && height <= 0)) {
            throw new IllegalArgumentException("The length of base and height must be set to positive values");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    @Override
    public Double area() {
        if (base == NOT_SET && height == NOT_SET) {
            System.out.println("Assuming triangle is right angled since base and height is not explicitly set");
            List<Double> sides = Arrays.asList(side1, side2, side3);
            sides.remove(sides.stream().max(Double::compare));
            return sides.get(0) * sides.get(1) / 2.0;
        } else {
            return base * height / 2.0;
        }

    }

    @Override
    public Double circumference() {
        return side1 + side2 + side3;
    }
}
