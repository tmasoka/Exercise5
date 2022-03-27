package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text:");

        String str=sc.next();
        String original_str=str;

        String rev ="";

        int len=str.length();

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(original_str.equals(rev))
        {
            System.out.println(original_str+" is Palindrome String");
        }
        else
        {
            System.out.println(original_str+" is not Palindrome String");
        }
        }
}
