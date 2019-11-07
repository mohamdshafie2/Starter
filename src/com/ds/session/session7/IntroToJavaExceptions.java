package com.ds.session.session7;

import java.io.File;
import java.io.IOException;

public class IntroToJavaExceptions {


    public static void main(String[] args){


        try {
            checkedExcption_();
        } catch (IOException e) {
            System.out.println("EXCEPTION HAPPENED !!!");
        }

        unCheckedExcption_();




    }


    private static void tryMe1() {
        unCheckedExcption_();
    }


    private static void unCheckedExcption_() {
        System.out.println(234/0);
    }


    private static void checkedExcption_() throws IOException {
        File myFile = new File("");

        myFile.getCanonicalPath();


        // either write this way
//        try{
//            myFile.getCanonicalPath();

//        } catch (IOException ex){
//            System.out.println("bad exption");

//        }
    }


}
