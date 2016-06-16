package com.jalasoft.forms;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class Circle extends Forms {

    private double radio;
    private static final double PI = 3.14;

    public Circle(double radio){
        super();
        this.radio = radio;
    }

    public double calPerimeter() {

        double perimeter = 2*PI*radio;

        return perimeter;
    }

    public double calArea() {

        double area = PI*radio*radio;

        return area;

    }
}
