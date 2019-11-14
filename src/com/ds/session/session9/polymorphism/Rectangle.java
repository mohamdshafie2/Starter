package com.ds.session.session9.polymorphism;

public class Rectangle extends Shape {

    Rectangle(){}


    private int height;
    private int width;


    @Override
    public void draw() {

    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
