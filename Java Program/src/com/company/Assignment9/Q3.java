package com.company.Assignment9;

import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("E:\\DSA\\Java Program\\src\\com\\company\\Assignment9\\file.txt");
        System.out.println("Is this file exists "+f.exists());
        Scanner input = new Scanner(f);
        while(input.hasNext()){
            String firstName = input.next();
            String lastName = input.next();
            String age = input.next();
            String marks = input.next();
            System.out.println(firstName+" "+lastName+" "+age+" "+marks);
        }
        input.close();
    } }
