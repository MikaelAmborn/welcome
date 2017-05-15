package com.amborn;

import java.util.List;

public class ShapeCalculator {
    public static Double areaOf(List<Shape> shapes) {
        return shapes.stream().mapToDouble(shape -> shape.area()).sum();
    }
}
