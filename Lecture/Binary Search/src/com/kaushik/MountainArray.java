package com.kaushik;

public class MountainArray {
    public static void main(String[] args) {

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
}
