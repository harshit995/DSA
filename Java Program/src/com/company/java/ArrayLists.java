package com.company.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(30);
        System.out.println(list);

        int elem =list.get(2);
        System.out.println(elem);

        list.add(0,6);
        System.out.println(list);

        list.set(1,60);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
