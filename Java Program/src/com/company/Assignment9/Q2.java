package com.company.Assignment9;

import java.io.*;

public class Q2 {
    public static void main(String[] args)throws IOException {
        File f = new File("E:\\DSA\\Java Program\\src\\com\\company\\Assignment9\\file.txt");
        if(f.exists()){
            System.out.println("The file is already exists");
            System.exit(1);
        }
        PrintWriter p = new PrintWriter(f);
        p.print("FirstName");
        p.print("LastName");
        p.print("Age");
        p.println("Marks");
        p.print("Amit");
        p.print("Singh");
        p.println("19");
        p.println("73");
        p.print("Sumit");
        p.print("Singh");
        p.println("18");
        p.println("75");
        p.print("Rahul");
        p.print("kumar");
        p.println("20");
        p.println("78");
        p.close();
        System.out.println(f.exists());
    }
}