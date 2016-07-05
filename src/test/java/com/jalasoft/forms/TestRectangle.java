package com.jalasoft.forms

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals


class RectangleTest {

    private final double side1Test = 4;

    private final double side2Test = 3;

    private Rectangle rectangle;

    @Before
    public void init() {
        rectangle = new Rectangle(side1Test, side2Test);
    }

    @Test
    public void TestCalculateRectanglePerimeter() {
        final double expectedPerimeter = 14;
        assertEquals(expectedPerimeter, rectangle.calPerimeter(), Constant.DELTA);
    }

    @Test
    public void TestCalculateRectangleArea() {
        final double expectedArea = 12;
        assertEquals(expectedArea, rectangle.calArea(), Constant.DELTA);
    }
}
