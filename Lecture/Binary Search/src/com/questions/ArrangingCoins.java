package com.questions;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1804289383;
        System.out.println(arrangeCoins(n));

    }

//    public static int arrangeCoins(int n) {
//        int start = 1;
//        int end = n;
//        while (start <= end){
//            int mid = start + (end-start) / 2;
//            long con = mid * (mid + 1L)/ 2L;
//            if (con > n){
//                end = mid - 1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return end;
//    }

    public static int arrangeCoins(int n) {
        int lo = 1, hi = n, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid * (mid + 1L) <= n * 2L) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi;
    }
}
