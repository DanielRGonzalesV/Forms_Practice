package com.jalasoft.forms

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals


class CircleTest {

    private final double radio = 2.3;

    private Circle circle;

    @Before
    public void init() {
        circle = new Circle(radio);
    }

    @Test
    public void TestCalculateCirclePerimeter() {
        final double expectedPerimeter = 14.451326206513047;
        assertEquals(expectedPerimeter, circle.calPerimeter(), Constant.DELTA);
    }

    @Test
    public void TestCalculateCircleArea() {
        final double expectedArea = 16.619025137490002;
        assertEquals(expectedArea, circle.calArea(), Constant.DELTA);
    }
}
