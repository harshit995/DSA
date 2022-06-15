package com.company.java;

import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        String name= "Harsh";
        int value = name.length();
        String values = name.toLowerCase();
        System.out.println(value);
        System.out.println(values);

        String nonTrimmed ="  harshit    ";
        System.out.println(nonTrimmed.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));

//        System.out.println(name.replace('H','p'));
        System.out.println(name.replace("Har","pit"));

        System.out.println(name.startsWith("har"));
        System.out.println(name.equals("harsh"));
        System.out.println(name.equalsIgnoreCase("harsh"));

        System.out.println("i am escape \n h");



    }
}
