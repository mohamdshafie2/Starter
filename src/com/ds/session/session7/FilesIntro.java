package com.ds.session.session7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FilesIntro {

        public static void main(String args[]) {

            String fileName = "/home/shafie/lessons/Starter/resources/sample_file.txt";

            //read file into stream, try-with-resources
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {// test 2

                Object[] fileLines = stream.toArray() ;

                for (int i=0 ; i<fileLines.length ;i++ ){
                    System.out.println((String)fileLines[i]);
                }

//                stream.forEach(System.out::println);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }




}
