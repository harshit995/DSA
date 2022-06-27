package com.company.java;


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i =1;
        while(i<=5){
            System.out.print("Enter choice : 0 for stone ,  1 for paper, 2 for scissor: ");
            int a = sc.nextInt();
            System.out.print("Computer choice is: ");
            Random rnd = new Random();
            int b= rnd.nextInt(3);
            System.out.println(b);
            System.out.println("Match Number: "+ i );
            switch(b){
                case 0 -> {
                    switch(a){
                        case 0 -> System.out.println("Tie");
                        case 1 -> System.out.println("You Won");
                        case 2 -> System.out.println("You loss");
                        default -> System.out.println("please enter valid info");
                    }
                }
                case 1 -> {
                    switch(a){
                        case 0 -> System.out.println("You loss");
                        case 1 -> System.out.println("Tie");
                        case 2 -> System.out.println("You won");
                        default -> System.out.println("please enter valid info");
                    }
                }
                case 2 -> {
                    switch(a){
                        case 0 -> System.out.println("You won");
                        case 1 -> System.out.println("You Loss");
                        case 2 -> System.out.println("Tie");
                        default -> System.out.println("please enter valid info");
                    }
                }
                default -> System.out.println("please enter valid info");
            }
            i++;
        }
        System.out.println("completed");




    }
}
