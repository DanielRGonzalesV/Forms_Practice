package com.jalasoft.forms

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals


class SquareTest {

    private final double sideTest = 4;
    private Square square;

    @Before
    public void init() {
        square = new Square(sideTest);
    }

    @Test
    public void TestCalculateSquarePerimeter() {
        final double expectedPerimeter = 16;
        assertEquals(expectedPerimeter, square.calPerimeter(), Constant.DELTA);
    }

    @Test
    public void TestCalculateSquareArea() {
        final double expectedArea = 16;
        assertEquals(expectedArea, square.calArea(), Constant.DELTA);
    }
}
