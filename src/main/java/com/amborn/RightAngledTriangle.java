package com.amborn;

import java.util.Arrays;
import java.util.List;

public class RightAngledTriangle implements Shape {
    private final Double side1;
    private final Double side2;
    private final Double side3;

    public RightAngledTriangle(Double side1, Double side2, Double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public Double area() {
        List<Double> sides = Arrays.asList(side1, side2, side3);
        sides.remove(sides.stream().max(Double::compare));
        return sides.get(0) * sides.get(1) / 2.0;
    }

    @Override
    public Double circumference() {
        return side1 + side2 + side3;
    }
}
