package com.company.DSA;
public class SquareRoot {
    static int square(int x){
        int low=0,high=x,ans=-1;
        while(low<=high) {
            int mid = low + ((high - low) / 2);
            int sqrt = mid * mid;
            if (sqrt == x) {
                return mid;
            } else if (sqrt > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("sqrt is " + square(26));
    }
}
