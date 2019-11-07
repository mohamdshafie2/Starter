package com.ds.session.session8;

public  class ClassB   extends ClassA  implements VideoEnabled {

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
