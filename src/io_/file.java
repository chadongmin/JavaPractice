package io_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class file {
    public static void main(String[] args)  {

        try {
//            var fis = new FileInputStream("/Users/cha/IdeaProjects/JavaPractice/src/io_/a.txt");
//            int i;
//            while((i = fis.read()) != -1){
//                System.out.print((char) i);
//            }
            var fis = new BufferedReader(new InputStreamReader( new FileInputStream("/Users/cha/IdeaProjects/JavaPractice/src/io_/a.txt")));
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
