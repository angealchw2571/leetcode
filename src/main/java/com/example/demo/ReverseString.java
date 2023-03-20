package com.example.demo;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
        reverseStr();
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void reverseStr(){
        StringBuffer sb=new StringBuffer("Text");
    
        //reverses the string "Text"
        sb.reverse();
        System.out.println("Reversed String: "+sb);
      }
}
