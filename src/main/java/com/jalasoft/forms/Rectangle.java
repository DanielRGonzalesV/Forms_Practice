package com.jalasoft.forms;

/**
 * Created by danielgonzales on 6/16/2016.
 */
public class Rectangle extends Forms{

    private double lado1;
    private double lado2;

    public Rectangle(double lado1, double lado2){
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calPerimeter() {

        double perimeter = lado1*2*lado2*2;

        return perimeter;
    }

    public double calArea() {

        double area = lado1*lado2;

        return area;

    }
}
