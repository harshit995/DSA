package com.company;

public class Condition {
    public static void main(String[] args) {
        int salary =25400;
//        if(salary > 10000){
//            salary +=2000;
//        }
//        else{
//            salary=salary+1000;
//        }

        int age=89;
        if(age>18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("not eligible");
        }

        if(salary < 10000){
            salary +=3000;
        }
        else if(salary>20000){
            salary+=10000;

        }
        else {
            salary+=salary;
        }
        System.out.println(salary);
    }
}
