package com.ds.homework;

public class StaticHistogram {



    public static void main(String[] args) {

        // Given the definition of histogram, simply a bar diagram.
        // For details see link
        // https://en.wikipedia.org/wiki/Histogram
        // We want to show a static Histogram with println("*") method that
        // represent 5 bars histogram values (13, 9, 2, 10, 5)
        //
        // The Illustration below is a representation for 5-bars histogram of values (4, 1, 1, 1, 2)
        //
        // *
        // *
        // *   *
        // *****


        //
        // *
        // *
        // *   *
        // *****


        //  PUT YOUR CODE HERE
        String str13="*", str9="*", str2="*", str10="*",str5="*" ;

        for (int i=13 ; i>0 ; i--){
            str13 = " "  ;
            str9  = " "  ;
            str2  = " "  ;
            str10 = " "  ;
            str5  = " "  ;

            if( i<=13 ){
                str13="*";
            }

            if(i<=9){
                str9="*";
            }

            if (i<=2 ){
                str2="*";
            }

            if(i<=10 ){
                str10="*";
            }

            if(i<=5){
                str5="*";
            }

            System.out.println(str13+str9+str2+str10+str5);
        }









    }





}
