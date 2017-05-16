package com.amborn;

import org.junit.Test;

import static com.amborn.Triangle.CreateRightAngledTriangle;
import static com.amborn.Triangle.CreateTriangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void area_shouldCalculateAreaOfRightAngledTriangles() {
        assertThat(CreateRightAngledTriangle(1.0, 1.0, 3.0).area(),
                is(0.5));
        assertThat(CreateRightAngledTriangle(2.0, 2.0, 4.0).area(),
                is(2.0));
        assertThat(CreateRightAngledTriangle(3.0, 2.0, 5.0).area(),
                is(3.0));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfRightAngledTriangles() {
        assertThat(CreateRightAngledTriangle(1.5, 1.0, 1.0).circumference(),
                is(3.5));
        assertThat(CreateRightAngledTriangle(3.0, 2.0, 1.0).circumference(),
                is(6.0));
        assertThat(CreateRightAngledTriangle(1.0, 10.0, 20.0).circumference(),
                is(31.0));
    }

    @Test
    public void area_shouldCalculateAreaOfNoneRightAngledTriangles() {
        assertThat(CreateTriangle(1.0, 2.0, 3.0, 1.0, 1.0).area(),
                is(0.5));
        assertThat(CreateTriangle(2.0, 3.0, 4.0, 2.0, 2.0).area(),
                is(2.0));
        assertThat(CreateTriangle(3.0, 4.0, 5.0, 2.0, 3.0).area(),
                is(3.0));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfNoneRightAngledTriangles() {
        assertThat(CreateTriangle(1.5, 1.0, 1.0, 1.0 , 1.0).circumference(),
                is(3.5));
        assertThat(CreateTriangle(3.0, 2.0, 1.0, 1.0, 2.0).circumference(),
                is(6.0));
        assertThat(CreateTriangle(1.0, 10.0, 20.0, 1.0, 10.0).circumference(),
                is(31.0));
    }

    @Test
    public void area_shouldReturnInfinityIfResultIsToBigForDoubleType() {
        Double x = CreateRightAngledTriangle(Double.MAX_VALUE, Double.MAX_VALUE, 1.0).area();
        assertThat(x, is(Double.POSITIVE_INFINITY));
    }
}
