package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
    //        Scanner input = new Scanner(System.in);
    //        float num=input.nextFloat();
    //        System.out.println(num);
//        type casting
        int num= (int)(67.56f);
        System.out.println(num);

//        automatic type promotion in expresss
        int a= 257;
        byte b = (byte)(a);



        System.out.println(b);


    }
}
