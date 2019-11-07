package com.ds.homework;

import java.util.Random;

public class Gaps {

    // given the values produced randomly above ,
    // write the code to calculate the differences between the values ,
    // assume it is a distance value so please make sure to give the result as a positive value
    //

    static Random rand = new Random();


    public static void main(String[] args){
        int len = 40;
        int[] starts = new int[len]; // array of int its length is len elements
        int[] ends = new int[len]; // array of int its length is len elements

        for(int i=0 ; i< len ; i++){
            starts[i] = rand.nextInt(10); // for i =0,1,2,... lets assume the values are 1,3,4,5,7,3, ...
            ends[i] = rand.nextInt(70);  // for i =0,1,2,... lets assume the values are 1, 16, 54,52,14,52,28,...
        }

//        // print gaps
//        for(int i=0 ; i< len ; i++){
//            System.out.println(starts[i] + "  <--- GAP --->  " + ends[i]);
//        }

        // SOLUTION HERE
        // samples
        //1-1
        //16-3
        //54-4
        // ends - starts
        int[] gaps = new int[len];
        for(int i=0 ; i< len ; i++){
            gaps[i] =  Math.abs(ends[i] - starts[i]);

//            gaps[i] = ends[i] - starts[i];
//            if (gaps[i]<0){// -ve
//                gaps[i] = gaps[i] * -1;
//            }

        }

// print gaps
        for(int i=0 ; i< len ; i++){
            System.out.println(starts[i] + "  <---  "+gaps[i]+"  --->  " + ends[i]  );
        }

    }






}
