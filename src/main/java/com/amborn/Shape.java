package com.amborn;

/**
 * A Shape interface that all shapes needs to implement.
 */
public interface Shape {
    /**
     * Calculates the area of the given shape.
     *
     * @return The are as a Double value
     */
    Double area();

    /**
     * Calculates the circumference of the given shape.
     *
     * @return The circumference as a Double value
     */
    Double circumference();
}
