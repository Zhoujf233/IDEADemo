package com.zhoujf.idea;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class HelloWorld {

    public static void main(String[] args) {
        List list = new ArrayList();
        String str = new String();
        if (str == null) {
            System.out.println(666);
        }

        ArrayList<String> List = new ArrayList<>();

        ArrayList<Integer> list2 =new ArrayList<>();
        System.out.print(123);

        String hello = new String("hello");

        method2();
    }

    public static void method2(){
        method3();
        System.out.println("hello");
    }

    private static void method3() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }


    @Test
    public void test1(){
        new Thread(){
            public void run(){

            }
        };
    }
}
