package com.company;

public class Puzzle {



    public static void main(String[] args) {

        // 1,2,3,4,5,6,7,8,9,....
        // 1
        // 2
        // foo
        // 4
        // bar
        // foo
        // ....
        // 14
        // foo bar
        //



        for (int i=1; i<101 ; i++){

            if ((i % 3 == 0) && (i % 5 ==0)){
                System.out.println("foo bar");
                continue;
            }

            if (i % 3 == 0){
                System.out.println("foo");
                continue;
            }

            if (i % 5 == 0){
                System.out.println("bar");
                continue;
            }

            System.out.println(i);

        }







    }





}
