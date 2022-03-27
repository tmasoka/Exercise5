package com.company;

import java.util.Random;

public class MaxMin {
    public static void main(String[] args) {
        int smallest=100,largest=0;
        Random r = new Random();

        int[] largeArray = new int[10];


        for (int i =0;i<largeArray.length; i++) {
            largeArray[i]=Math.round((r.nextInt(100)+1));
            System.out.print(largeArray[i]+ ", ");
            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];
        }
            System.out.println();
            System.out.println("The smallest value in the Array is:" + smallest);
            System.out.println("The largest value in the Array is:" + largest);

    }
}