package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//       print number from 1 to n

//        System.out.print("enter n");
//        Scanner in =new Scanner(System.in);
//        int n=in.nextInt();
//
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//        }

//        while loop
 int num = 1;
        while(num<=5){
            System.out.println(num);
            if (num == 2) {
                System.out.println("ending");
                break;
            }
            num++;
        }
//
//        int n= 1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=5);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("hi");
            if (i == 2) {
                System.out.println("out");
                break;
            }
        }
        System.out.println("here i am ");
    }


}
