package com.questions;

public class Sqrt {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(mySqrt(x));

    }

//    public static int mySqrt(int x) {
//        int start = 0;
//        int end = x;
//
//        while (start<end){
//            int mid = start + (end - start) / 2;
//            if (mid*mid < x){
//                end = mid -1;
//            }else if (mid*mid > x){
//                start = mid + 1;
//            }else {
//                return mid;
//            }
//        }
//        return end;
//    }

    public static int mySqrt(int x) {
        long lo = 0;
        long hi = x;

        while(hi>lo){
            long mid = lo+(hi-lo+1)/2;
            if(x<mid*mid)
                hi = mid-1;      // not hi = mid
            else
                lo = mid;
        }
        return (int)lo;
    }
}
