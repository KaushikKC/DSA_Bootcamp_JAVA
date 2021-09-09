package com.kaushik;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 25;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] a,int target){
        int start = 0;
        int end = a.length-1;

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
        return a[start];

    }
}
