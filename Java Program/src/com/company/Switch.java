package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit =in.next();


        switch (fruit) {
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("sweet red");
            case "Orange" -> System.out.println("round");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter valid info");
        }


//        switch(fruit){
//            case "Mango":
//                System.out.println("King");
//                break;
//            case "Apple":
//                System.out.println("sweet red");
//                break;
//            case "Orange":
//                System.out.println("round");
//                break;
//                case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("please enter valid info");
//        }
    }
}
