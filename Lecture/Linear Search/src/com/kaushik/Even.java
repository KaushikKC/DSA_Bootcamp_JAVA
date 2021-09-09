package com.kaushik;

public class Even {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(number(nums));

    }
    static int number(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (sum(num)){
                count++;
            }

        }
        return count;
    }

    static boolean sum(int num){
        int digitsofnum = digit(num);
        return (digitsofnum % 2 == 0);
    }

    static int digit(int n){
        if (n < 0){
            n *= -1;
        }

        if (n == 0){
            return 1;
        }

        int count = 0;
        while (n>0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
