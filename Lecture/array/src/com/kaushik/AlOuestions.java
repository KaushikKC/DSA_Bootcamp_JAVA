package com.kaushik;

import java.util.Arrays;
import java.util.Scanner;

public class AlOuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(large(arr));
        reverse(arr);
//        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }

    static int large(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
