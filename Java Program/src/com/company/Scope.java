package com.company;

public class Scope {
    public static void main(String[] args) {
    int a =10;
    int b =20;

        {
            a=78;//reassign
            int c =99;
            //valus initialised in block cannot use outside block
        }

    }
    static  void random(int marks){
        int num=67;

    }
}
