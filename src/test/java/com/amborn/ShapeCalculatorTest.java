package com.amborn;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShapeCalculatorTest {
    @Test
    public void areaOf_shouldReturnTheAreaOfTheGivenShapes() {
        assertThat(ShapeCalculator.areaOf(Collections.emptyList()),
                is(0.0));
        assertThat(ShapeCalculator.areaOf(Arrays.asList(new Rectangle(1.0))),
                is(1.0));
        assertThat(ShapeCalculator.areaOf(Arrays.asList(new Rectangle(1.0),
                                                        new Rectangle(2.0))),
                is(5.0));
        assertThat(ShapeCalculator.areaOf(Arrays.asList(new Rectangle(1.0),
                                                        new Rectangle(2.0),
                                                        new RightAngledTriangle(1.0,2.0,2.0))),
                is(6.0));
    }
}
