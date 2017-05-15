package com.amborn;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void area_shouldCalculateAreaOfSomeRectangles() {
        assertThat(new Rectangle(1.0).area(),
                is(1.0));
        assertThat(new Rectangle(2.0).area(),
                is(4.0));
        assertThat(new Rectangle(4.0).area(),
                is(16.0));
    }

    @Test
    public void area_shouldReturnInfinityIfResultIsToBigForDoubleType() {
        Double x = new Rectangle(Double.MAX_VALUE).area();
        assertThat(x, is(Double.POSITIVE_INFINITY));
    }

    @Test
    public void circumference_shouldReturnTheCircumferenceOfSomeRectangles() {
        assertThat(new Rectangle(1.0).circumference(),
                is(4.0));
        assertThat(new Rectangle(2.0).circumference(),
                is(8.0));
        assertThat(new Rectangle(4.0).circumference(),
                is(16.0));
    }
}
