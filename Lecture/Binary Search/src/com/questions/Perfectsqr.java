package com.questions;

public class Perfectsqr {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end){
            int mid = start +(end - start) / 2;
            if (num == mid * mid && num%mid == 0){
                return true;
            } else if (mid >= num/mid){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
