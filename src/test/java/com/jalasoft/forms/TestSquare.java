package com.jalasoft.forms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class TestSquare {

    static final private double sideTest = 4;
    static private Square square;

    @Before
    public void init() {
        square = new Square(sideTest);
    }

    @Test
    public void TestCalculateSquarePerimeter() {

        final double expectedPerimeter = 64;

        assertEquals(expectedPerimeter, square.calPerimeter(), Constant.delta);

    }

    @Test
    public void TestCalculateSquareArea() {

        final double expectedArea = 16;

        assertEquals(expectedArea, square.calArea(), Constant.delta);

    }
}
