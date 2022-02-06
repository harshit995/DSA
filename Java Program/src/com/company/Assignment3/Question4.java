package com.company.Assignment3;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int min=0;
        int max=9;
        int num1=(int)(Math.random()*(max-min+1)+min);
        int num2=(int)(Math.random()*(max-min+1)+min);

        if (num1<num2){
            int temp = num1;
            num1= num2;
            num2=temp;
        }

        System.out.println("What is the value of "+num1+" - "+ num2+" :");

        int ans=in.nextInt();
        if(num1-num2==ans){
            System.out.println("The answer is correct");
        }else{
            System.out.println("The answer is incorect");
        }
    }
}