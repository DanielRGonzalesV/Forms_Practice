package com.jalasoft.forms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class TestCircle {

    static final double radio = 2.3;
    static private Circle circle;

    @Before
    public void init() {
        circle = new Circle(radio);
    }

    @Test
    public void TestCalculateCirclePerimeter() {

        final double expectedPerimeter = 14.443999999999999;

        assertEquals(expectedPerimeter, circle.calPerimeter(), Constant.delta);

    }

    @Test
    public void TestCalculateCircleArea() {

        final double expectedArea = 16.610599999999998;

        assertEquals(expectedArea, circle.calArea(), Constant.delta);

    }
}
