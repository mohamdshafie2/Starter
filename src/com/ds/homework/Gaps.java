package com.ds.homework;

import java.util.Random;

public class Gaps {

    // given the values produced randomly above ,
    // write the code to calculate the differences between the values ,
    // assume it is a distance value so please make sure to give the result as a positive value

    static Random rand = new Random();


    public static void main(String[] args){
        int len = 40;
        int[] starts = new int[len];
        int[] ends = new int[len];

        for(int i=0 ; i< len ; i++){
            starts[i] = rand.nextInt(10);
            ends[i] = rand.nextInt(70);
        }

        // print gaps
        for(int i=0 ; i< len ; i++){
            System.out.println(starts[i] + "    " + ends[i]);
        }





    }






}
