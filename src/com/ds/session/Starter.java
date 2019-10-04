package com.ds.session;

public class Starter {

    public static void main(String[] args) {

        System.out.println(" hello world ---1  "); // 1 byte = XX XX XX XX BITS

        int ii = 0 ;
        float someFloat = 4.8f;     // 4 * 8 = (32 BITS)  // X B=XXXXX  M=XXXXXXXXXXXXXXXXXXXXXXXXXXX       =   (+/-)  *   (2^B)  * M
        double someFraction = 4.8 ; // 8 * 8 = (64 BITS)  // X XXXXXXXXXXXXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        double someFraction2 = 4.8 ;

        float fl = 3/4 ;
        float fl1 = new Float( someFraction/someFraction2);

        String strr = "this is a very importat type of variables";
        strr = "this is a very importat type of variables" + "test";

        char c = 'f';
        boolean b= true;


        if ( 2==9 ){
            System.out.println("should never see this statement");
        }

        if ( 9==9 ){
            System.out.println("should ALWAYS see this statement");
        }


        String str1 = "value 1";
        String str2 = "value 1";

        if (str1 == str2){// not guaranteed
            System.out.println("might print this , maybe not ");
        }

        if (str1.compareTo(str2) == 0 ){// guaranteed
            System.out.println("WILL print this ");
        }


         str1 = "value 1";
         str2 = "value 2";

        if (str1 == str2){// not guaranteed
            System.out.println("WILL NOT print this");
        }

        if (str1.compareTo(str2) == 0 ){
            System.out.println("WILL NOT print this ");
        }



        // for each one of those , do the following in this loo[p
        // foreach

        // start from here do this till there
        // for-loop

        // while this is the case, do this
        // while loop
            // special case ... while this is the case, break in the middle if this happened (1 and half loop)

        // do this untill this condition breaks, but do it at least once
        // do -while



        for (int i=0; i<10 ; i++){
            System.out.println("in for loop");

        }





    }
}
