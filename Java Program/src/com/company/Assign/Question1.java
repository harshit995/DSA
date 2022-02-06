package com.company.Assign;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

System.out.print("Input an integer between 0 and 1000: ");
    int num = input.nextInt(); // to take input
    int firstDigit = num % 10;  // to take first digit
    int remainingNumber = num / 10;
    int SecondDigit = remainingNumber % 10;
    remainingNumber = remainingNumber / 10;
    int thirdDigit = remainingNumber % 10;
    remainingNumber = remainingNumber / 10;
    int fourthDigit = remainingNumber % 10;
    int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit; // to get sum
System.out.println("The sum of all digits in " + num + " is " + sum);
} }
