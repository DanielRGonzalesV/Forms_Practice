package com.jalasoft.forms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class TestRectangle {

    static final private double lado1Test = 4;
    static final private double lado2Test = 3;
    static private Rectangle rectangle;

    @Before
    public void init() {
        rectangle = new Rectangle(lado1Test, lado2Test);
    }

    @Test
    public void TestCalculateRectanglePerimeter() {

        final double expectedPerimeter = 48;

        assertEquals(expectedPerimeter, rectangle.calPerimeter(), Constant.delta);

    }

    @Test
    public void TestCalculateRectangleArea() {

        final double expectedArea = 12;

        assertEquals(expectedArea, rectangle.calArea(), Constant.delta);

    }
}
