package com.company.Assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // to take input
        System.out.println("Input weight in kG: ");
        double weight = in.nextDouble();
        System.out.println("Input height in M: ");
        double height = in.nextDouble();
        double BMI = weight / (height * height); // formula
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
