package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius ");
        double c=input.nextDouble();
        double temp= (c*9/5) +32 ;
        System.out.println("Your temperature in farenheit is " +temp);
    }
}
