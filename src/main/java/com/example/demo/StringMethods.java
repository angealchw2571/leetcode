package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMethods {
    public static void main(String args[]) {
        // creating StringBuffer object using default constructor
        StringBuffer sb = new StringBuffer();
        //appending a string to newly created instance
        sb.append("BeginnersBook.com");
        System.out.println("First String: "+sb);

        //Using StringBuffer(String str) constructor
        String str = "hello";
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println("Second String: "+sb2);

        //Using StringBuffer(int Capacity) constructor
        StringBuffer sb3 = new StringBuffer(24);
        System.out.println("Capacity of sb3: "+sb3.capacity());

        //creating StringBuffer(CharSequence cs) constructor
        StringBuffer sb4 = new StringBuffer("Welcome");
        System.out.println("Fourth String: "+sb4);
        

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] myNum = { 10, 20, 30, 40 };
        cars[0] = "mycar";
        System.out.println(Arrays.toString(cars));

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        List<Integer> testarr = new ArrayList<>();
        arrlist.add(200);
        arrlist.add(300);
        arrlist.add(400);
        arrlist.add(500);
        testarr.add(10);
        System.out.println(arrlist);
        System.out.println(testarr);
        arrlist.set(0, 1000);
        System.out.println(arrlist);

    }

}
