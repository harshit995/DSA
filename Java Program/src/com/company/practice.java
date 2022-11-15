package com.company;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double d =scan.nextDouble();
        int i = scan.nextInt();

        scan.nextLine();
//        scan.skip("\\R?");
        String s =scan.nextLine();




        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}