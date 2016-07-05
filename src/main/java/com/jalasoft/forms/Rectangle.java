package com.jalasoft.forms;


public class Rectangle extends Forms {

    private final double side1;

    private final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calPerimeter() {
        return Constant.FACTOR_FORMULA * (side1 + side2);
    }

    public double calArea() {
        return side1 * side2;
    }
}
