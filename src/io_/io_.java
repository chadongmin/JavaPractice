package io_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class io_ {
    public static void main(String[] args) throws IOException{
        int i;
        //case1 : 표준 입력 Stream
//            while((i = System.in.read()) != '\n'){
//                System.out.println((char) i);
//            }

        //case2 : Reader로 Wrapping을 해서 문자를 지원
//        var isr = new InputStreamReader(System.in);
//        while((i = isr.read()) != '\n'){
//            System.out.print((char)i);
//        }

        //case3 : 문자열 처리가 가능
        var br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //read()는 한 문자씩 읽어오는 것이니까 readLine()을 쓰면 \n을 만나는 지점까지 읽는다.
        System.out.println(str);

        br.close();




        System.in.close();
        //System.out.println((char)i);

    }
}
