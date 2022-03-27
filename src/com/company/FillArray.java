package com.company;

public class FillArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int num=9;

        for(int i=0; i < intArray.length; i++) {
            intArray[i] = num;
            num--;

        }
        System.out.println("The value of the array:");

        for(int i=0; i < intArray.length; i++)
        {
            System.out.println("Array["+i+"]="+intArray[i]);
        }
        }
}
