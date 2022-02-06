package com.company.Assignment3;

import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        System.out.println("Integer" + n);

        String name= obj.next();
        System.out.println("String " + name);

        byte b =obj.nextByte();
        System.out.println("Byte" +b);

        short s = obj.nextShort();
        System.out.println("short " + s);

        long l = obj.nextLong();
        System.out.println("long " +l);

        float f=obj.nextFloat();
        System.out.println("the float"+f);

        double g=obj.nextDouble();
        System.out.println("the double"+g);

        boolean bool =obj.nextBoolean();
        System.out.println("Boolean" + bool);
    }
}
