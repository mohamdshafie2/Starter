package com.ds.homework;

public class Worms_Solution {



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


        // HINT#2
        // convert 1101 => "1101" => ["11" , "1"] => [11, 1] => 12
        // convert 1090501 => "1090501" => ["1" , "9" , "5" , "1"] => [1 , 9 , 5 , 1] => 16

        String emptyString = "" ;
        int counter =0 ;
        for (int i=0 ; i<= 9999 ; i++){// iterate over all numbers
            String beforeWorms = ""+i;// convert into strings
            String[] eatenByWorms = beforeWorms.split("0"); //convert into array of strings

            for (int j=0; j<eatenByWorms.length ; j++){ // iterate over array of strings
                if(emptyString.compareTo(eatenByWorms[j]) == 0){// do not parse empty strings
                    continue;
                }
                int temp = Integer.parseInt(eatenByWorms[j]) ;//convert result strings to ints
                counter = counter + temp ; // add ints
            }
        }

        System.out.println("after worm attack = " + counter); //37359000 in case max number is 9999
    }
}
