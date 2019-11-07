package com.ds.session.session7;

public class Casting {



    public static void main(String[] args){

        int i = (int) (14/5f);
        float ff = 3/4;
        long lo = (long) 33.3;




        ClassA a = new ClassB();
        ClassB b = new ClassB();

        VideoEnabled v1 = (VideoEnabled) a ;
        VideoEnabled v2 =   b ;


    }



}
