package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(5);

//        list.add(67);
//        list.add(657);
//        list.add(674);
//        list.add(674);
//        list.add(6745);
//
//
//        System.out.println(list);

// input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item to any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here , list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
