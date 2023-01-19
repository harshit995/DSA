package com.company.DSA;


//public class SortedRotated {
//    static int sortRotated(int [] arr,int n , int x){
//        int low =0,high=n-1;
//        while(low<=high){
//            int mid = low + ((high - low) / 2);
//            if(arr[mid]==x){
//                return mid;
//            }
//            else{
//                if(arr[low]<=arr[mid]){
//                    if (x>=arr[low] && x<=arr[mid]){
//                        high=mid-1;
//                    }
//                    else{
//                    }
//                }
//                else {
//                    if(x>arr[mid] && x<=arr[high]){
//                        low=mid+1;
//                    }
//                    else{
//                        high=mid-1;
//                    }
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr={3,5,6,1,2};
//        int n=arr.length;
//        int x=2;
//        System.out.println("element present at " +sortRotated(arr,n,x));
//    }
//}

public class SortedRotated {
    public static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = low+(high-low)/ 2;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[low]) low++;
            else if(nums[mid] > nums[low]) {
                if(nums[mid] > target && nums[low] <= target) high = mid - 1;
                else low = mid + 1;
            } else {
                if(nums[mid] < target && nums[high] >= target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,1,2};
        int n=arr.length;
        int x=2;
        System.out.println("element present at " +search(arr,x));
    }
}
