package com.ds.session.session7;

public  class ClassB  extends ClassA implements VideoEnabled{


    @Override
    public void fly() {

    }


    @Override
    public boolean isVideoEnabled() {
        return false;
    }
}
