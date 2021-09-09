package com.questions;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;

        int end = nums.length - 1;
        while(start<=end){
            if (nums.length == 1){
                return nums[start];
            }
            if (nums[start] == nums[start+1]){
                start += 2;
            }else {
                return nums[start];
            }

            if (nums[end] == nums[end-1]){
                end -= 2;
            } else {
                return nums[end];
            }
        }
        return 0;
    }
}
