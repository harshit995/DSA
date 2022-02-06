package com.company.Assignment4;

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value : ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("Enter an int value : ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);

    }
}