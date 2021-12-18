package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit =in.next();

        if(fruit.equals("mango")){
            System.out.println("King of Fruits");
        } else if(fruit.equals("Apple")){
            System.out.println("Keeps the doctor away");
        }
        else{
            System.out.println("invalid fruit");
        }
    }
}
