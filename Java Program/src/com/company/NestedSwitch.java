package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empId=in.nextInt();
        String department =in.next();

        switch (empId){
            case 1:
                System.out.println("Aniket");
                break;
            case 2:
                System.out.println("Devesh");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Dep");
                        break;
                    case "Management":
                        System.out.println("Manage");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Invalid Employee Id");
        }
    }
}
