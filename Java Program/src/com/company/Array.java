package com.company;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
//        // store a roll number
//        int a=190;
//
//        //store 5 number
//        int rno1 =23;
//        int ron2=67;
//        int ron3=90;


        //syntax

        // datatype[] variable_name = new datatype[size];

//        int[] rnos = new int[5];
        // or directly

//        int[] rnos2 ={2,5,6,78,0};

//        int[] rnos; // declaration
//         rnos = new int[5]; // objected created in heap memory
//
//        System.out.println(rnos[1]);

//420*594 a2
//        170mm*65
//hb h 2h

//        int [] marks = new int[5];
        int[] marks= {1,2,3,5} ;
//        float [] rnoss= {1.2f,2.3f,3,5} ;

//        String[] students={"harshit","harsh"};

        System.out.println(marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nfor each");
        for (int element: marks) {
            System.out.println(element);
        }
    }
}
