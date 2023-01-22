package com.company.DSA;
import java.util.*;
public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> set = new ArrayList<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }

        int[] result = new int[set.size()];

        for(int i=0;i<result.length;i++) {
            result[i] = set.get(i);
        }
        return result;
    }

    public static boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        int[] ans=intersection(arr1,arr2);
//        System.out.println("elements are" + intersection(arr1,arr2));
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}