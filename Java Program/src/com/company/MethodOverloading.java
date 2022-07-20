package com.company;

public class MethodOverloading {
    static  void change(int a){
        a=98;
    }
    static  void change2(int[] arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println("This is a Joke");
    }
    static void food(){
        System.out.println("good morning bro!");
    }
    static void food(int a){
        System.out.println("good morning" + a +  "bro!");
    }
    public static void main(String[] args) {
//        fun(34);
//        fun("harshit");
//        int ans=sum1(2,5);
//        System.out.println(ans);
//        tellJoke();

//        int[] marks = {12,23,56,89,56};

//        changing the integer
//        int x=45;
//        change(x);
//        System.out.println("X after running is " + x);

//        changing the array
//        int[] marks = {52,23,56,89,56};
//        change2(marks);
//        System.out.println("X after running is " + marks[0]);

        food();
        food(3000);

    }
//    static int sum1(int a,int b){
//        return a+b;
//    }
//    static  void fun(int a){
//        System.out.println("first one");
//        System.out.println(a);
//    }
//    static void fun(String name){
//        System.out.println("second one");
//        System.out.println(name);
//    }
}
