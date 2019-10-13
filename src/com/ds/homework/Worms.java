package com.ds.homework;

public class Worms {



    public static void main(String[] args) {

        // Given numbers from 1->1000000 written in a paper,
        // 1101 became => 11+1 = 12
        // 12301 became => 123+1  = 124
        // 10000 became => 1      = 1
        //
        // hints ...
        // 1- use this for loop
        // 2- use string split.
        // 3- use int to String (notTaco)

        String[] parts = "taco - bell".split("-") ;
        for (int i=0 ; i<parts.length ; i++ ){
            System.out.println(parts[i]);
        }

        String notTaco = 200+"";
        System.out.println(notTaco);


//        for(int i=1;  i <= 1000000 ; i ++){
//
//        }


// for demonstration purposes only .... you should see this when you pull from git 


    }





}
