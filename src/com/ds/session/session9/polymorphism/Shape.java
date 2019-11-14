package com.ds.session.session9.polymorphism;

public abstract class Shape implements Drawable , CenterRetrievable {

    protected Point center;



    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

}
