package com.amborn;

import org.junit.Test;

import static com.amborn.Triangle.createRightAngledTriangle;
import static com.amborn.Triangle.createTriangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void area_shouldCalculateAreaOfRightAngledTriangles() {
        assertThat(createRightAngledTriangle(1.0, 1.0, 3.0).area(),
                is(0.5));
        assertThat(createRightAngledTriangle(2.0, 2.0, 4.0).area(),
                is(2.0));
        assertThat(createRightAngledTriangle(3.0, 2.0, 5.0).area(),
                is(3.0));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfRightAngledTriangles() {
        assertThat(createRightAngledTriangle(1.5, 1.0, 1.0).circumference(),
                is(3.5));
        assertThat(createRightAngledTriangle(3.0, 2.0, 1.0).circumference(),
                is(6.0));
        assertThat(createRightAngledTriangle(1.0, 10.0, 20.0).circumference(),
                is(31.0));
    }

    @Test
    public void area_shouldCalculateAreaOfNoneRightAngledTriangles() {
        assertThat(createTriangle(1.0, 2.0, 3.0, 1.0, 1.0).area(),
                is(0.5));
        assertThat(createTriangle(2.0, 3.0, 4.0, 2.0, 2.0).area(),
                is(2.0));
        assertThat(createTriangle(3.0, 4.0, 5.0, 2.0, 3.0).area(),
                is(3.0));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfNoneRightAngledTriangles() {
        assertThat(createTriangle(1.5, 1.0, 1.0, 1.0 , 1.0).circumference(),
                is(3.5));
        assertThat(createTriangle(3.0, 2.0, 1.0, 1.0, 2.0).circumference(),
                is(6.0));
        assertThat(createTriangle(1.0, 10.0, 20.0, 1.0, 10.0).circumference(),
                is(31.0));
    }

    @Test
    public void area_shouldReturnInfinityIfResultIsToBigForDoubleType() {
        Double x = createRightAngledTriangle(Double.MAX_VALUE, Double.MAX_VALUE, 1.0).area();
        assertThat(x, is(Double.POSITIVE_INFINITY));
    }
}
