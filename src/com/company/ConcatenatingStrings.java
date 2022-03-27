package com.company;

import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter FirstName:");
        String firstname = sc.nextLine();
        System.out.println("Enter LastName:");
        String lastname = sc.nextLine();

        System.out.println(firstname + " " + lastname);
    }
}