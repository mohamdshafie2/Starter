package com.ds.session.session9;

public  class ClassB   extends ClassA implements VideoEnabled {

    int id;

    public  ClassB(int id){
        this.id = id;
    }

    @Override
    public void fly() {

    }


    @Override
    public boolean isVideoEnabled() {
        return false;
    }
}
