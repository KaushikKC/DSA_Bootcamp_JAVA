package com.kaushik;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
    }

    public int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end ){
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;

    }

    static int binarySearch(int[] a,int target, int start, int end){

        boolean isasn = a[start] < a[end];

        while (start <= end){
            int mid = start + (end-start)/2;


            if (a[mid] == target){
                return mid;
            }

            if (isasn){
                if (a[mid] > target){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            } else {
                if (a[mid] < target){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }


}
