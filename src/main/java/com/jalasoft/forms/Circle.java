package com.jalasoft.forms;

public class Circle extends Forms {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calPerimeter() {
        return (Math.PI + Math.PI) * radio;
    }

    public double calArea() {
        return Math.PI * radio * radio;
    }
}
