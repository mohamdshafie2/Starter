package com.ds.session.session9;

import java.util.ArrayList;
import java.util.List;

public class CollectionsClassIntro {



    public static void main(String[] args){

        List<ClassB> bList = new ArrayList<>();
        for (int i =0; i<10 ; i++){
            bList.add(new ClassB(i*10));

        }
        System.out.println(bList.size());// should have same value like i


        for (ClassB b: bList){
        // instead of typing the following :
//            for (int j=0; j< bList.size();j++){
//                ClassB b = bList.get(j);
                System.out.println("my id = " + b.id);
        }

        bList.stream().forEach(b -> System.out.println("" + b.id));


    }



}
