package com.amborn;

import java.util.List;

/**
 * This class contains calculations that can be performed on shapes.
 */
public class ShapeCalculator {
    /**
     * Calculates the sum of areas of the given shapes.
     * @param shapes A list of Shapes to calculate area for
     * @return The sum of the areas of the given Shapes.
     */
    public static Double areaOf(List<Shape> shapes) {
        return shapes.stream().mapToDouble(shape -> shape.area()).sum();
    }
}
