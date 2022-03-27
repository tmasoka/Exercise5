package com.company;

public class TwoDimArray {
    public static void main(String [] args){
        int i,j;
        int matrixArray[][] = new int [10][10];

        for(i=0; i<10; ++i){
            for(j =0; j<10; j++){
                matrixArray[j][i] = i+1;
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
