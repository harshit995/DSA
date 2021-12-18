package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=28479;
        while(n>0){
            int rem=n%10;
            System.out.print(rem);
            n=n/10;
        }
//        int ans =0;
//        while(n>0){
//            int rem=n%10;
//            n/=10;
//            ans=ans*10+rem;
//        }
//        System.out.println(ans);
    }
}
