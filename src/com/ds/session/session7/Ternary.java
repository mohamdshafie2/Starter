package com.ds.session.session7;

public class Ternary {


public static void main(String[] args){

    int someValue =0;
    String flag=null;
//    someValue = (flag == null) ? -1 : 1;

    someValue = 1;
    if(flag == null){
        someValue = -1;
    }



//    if(flag == null){
//        someValue = -1;
//    }else{
//        someValue = 1;
//    }


    System.out.println(someValue);

}


}
