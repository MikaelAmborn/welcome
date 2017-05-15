package com.amborn;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RightAngledTriangleTest {

    @Test
    public void area_shouldCalculateAreaOfSomeTriangles() {
        assertThat(new RightAngledTriangle(1.0, 1.0, 3.0).area(),
                is(0.5));
        assertThat(new RightAngledTriangle(2.0, 2.0, 4.0).area(),
                is(2.0));
        assertThat(new RightAngledTriangle(3.0, 2.0, 5.0).area(),
                is(3.0));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfSomeTriangles() {
        assertThat(new RightAngledTriangle(1.5, 1.0, 1.0).circumference(),
                is(3.5));
        assertThat(new RightAngledTriangle(3.0, 2.0, 1.0).circumference(),
                is(6.0));
        assertThat(new RightAngledTriangle(1.0, 10.0, 20.0).circumference(),
                is(31.0));
    }

    @Test
    public void area_shouldReturnInfinityIfResultIsToBigForDoubleType() {
        Double x = new RightAngledTriangle(Double.MAX_VALUE, Double.MAX_VALUE, 1.0).area();
        assertThat(x, is(Double.POSITIVE_INFINITY));
    }
}
