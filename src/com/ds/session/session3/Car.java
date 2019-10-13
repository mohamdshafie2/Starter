package com.ds.session.session3;

public class Car extends ParentCar{
    // today is oct 12th

    private int mileage= 0 ;

    // private
    // public
    // empty = default = package
    // protected


    public Car(){//default constructor

    }

    void turn(int degree){
        System.out.println("car turned " + degree + " degrees");
    }

    void increaseMileage(int addition){
        this.mileage = this.mileage+addition;
    }

    int knowMileage(){
        return mileage;
    }



    private void setMileage2(int mileage) {
        this.mileage = mileage;
    }

    private void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }






}
