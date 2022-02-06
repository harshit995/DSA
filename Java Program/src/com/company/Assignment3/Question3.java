package com.company.Assignment3;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
//
        Scanner in = new Scanner(System.in);
        int min=0;
        int max=9;
        int num1=(int)(Math.random()*(max-min+1)+min);
        int num2=(int)(Math.random()*(max-min+1)+min);
        System.out.println("What is the value of " +num1+" and "+num2+" :");
        int ans=in.nextInt();
        if(num1+num2==ans){
            System.out.println("The answer is correct");
        }else{
            System.out.println("The answer is incorect");
        }}}
