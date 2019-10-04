package com.ds.session;

public class Puzzle {



    public static void main(String[] args) {

        // You are given the numbers 1,2,3,4,5,6,7,8,9,.... 100
        // It is required to print each in a line with the following conditions,
        // Cond.1 - When you get 3,6,9 ...      replace it with "foo"
        // Cond.2 - When you get 5,10,20,25 ...  replace it with "bar"
        // Cond.3 - When you get 15,45,60 ...    replace it with "foo bar"
        //
        // Illustration below
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


        // SOLUTION
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
