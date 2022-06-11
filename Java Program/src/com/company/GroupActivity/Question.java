package com.company.GroupActivity;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {    // main function
        System.out.println("Enter first and second number:");
        Scanner inp = new Scanner(System.in);//  scanner input
        int num1, num2;
        num1 = inp.nextInt();//input num1
        num2 = inp.nextInt();//input num2

        System.out.println("Enter your selection: 1 for Maximum, 2 for " +
                "Minimum 3 for Hypotenuse and 4 for Power:");
        int choose;  //for choosing different cases.
        choose = inp.nextInt();
        switch (choose) {
            case 1 -> System.out.println("Max number is" + max(num1, num2)); //this case is
            // for finding maximum of two elements
            case 2 -> System.out.println( "Min number is" + min(num1, num2));//this case is
            // minimum of two elements
            case 3 -> System.out.println( "Hypotenuse is " + hypotenuse(num1, num2));// this
            // case is used to find hypotenuse
            case 4 -> System.out.println( "power of numbers are " + power(num1, num2));//this case
            // is used to find power of two numbers.
            default -> System.out.println("Illegal Operation");
        }
    }
    public static int max(int x,int y) { //this function is used to find maximum of two numbers.
        int result = Math.max(x, y);
        return result;           // return value of result
    }

    public static int min(int x, int y) {  //this case is used to find minimum of two numbers
        int result = Math.min(x, y);
        return result;    // return value of result
    }

    public static int hypotenuse(int x, int y) { //this case is used to find hypotenuse of two numbers
        int result = (int) Math.hypot(x, y);
        return result;
    }

    public static int power(int x, int y) { //this function  is used to find power of two numbers.
        int result = (int) Math.pow(x, y);
        return result;
    }

}
