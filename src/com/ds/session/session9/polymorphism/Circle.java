package com.ds.session.session9.polymorphism;

public class Circle extends Shape {

    private int radius;

    Circle(){}


    @Override
    public void draw() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
