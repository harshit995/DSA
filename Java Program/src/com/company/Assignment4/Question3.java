package com.company.Assignment4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count=1;


        while(count!=0){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            int sum=number1+number2;

            System.out.println("Enter the value of "+number1+"+"+number2+" :");
            int ans=in.nextInt();

            if(ans!=sum){
                System.out.println("Incorrect answer Try Again!!");
            } else if (ans == sum) {

                System.out.println("Correct Answer");
                break;
            }
            count++;

        }}}
