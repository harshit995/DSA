package com.company;

import java.util.Arrays;

public class VarArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,9);
        multiple(2,3,"harshit","harshit gupta");

    }
    static void multiple(int a ,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
