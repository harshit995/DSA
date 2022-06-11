package com.company.Assignment9;

import java.io.*;
import java.util.*;
public class Q1 {
    public static void main(String[] args) throws IOException{
        File f = new File("E:\\DSA\\Java Program\\src\\com\\company\\Assignment9\\file.txt");

        System.out.println("IS file exists "+f.exists());
        System.out.println("length of file "+f.length());
        System.out.println("Can it be read "+f.canRead());
        System.out.println("Can it be write "+f.canWrite());
        System.out.println("Is it a directory "+f.isDirectory());
        System.out.println("Is it a file "+f.isFile());
        System.out.println("Absolute path "+f.getAbsolutePath());
        System.out.println("Last modified on "+new Date(f.lastModified()));
    }
}