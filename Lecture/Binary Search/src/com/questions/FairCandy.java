package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FairCandy {
    public static void main(String[] args) {
        int[] A= {1,2,5};
        int[] B= {2,4};
        System.out.println(Arrays.toString(fairCandySwap(A,B)));
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        List<Integer>list = new ArrayList<>();
        for (int num : aliceSizes) {
            sum1 += num;
            list.add(num);
        }
        for (int num : bobSizes){
            sum2 += num;
        }

        int diff = (sum1 - sum2) / 2;
        int[] ans = new int[2];
        for (int n : bobSizes){
            if (list.contains(n + diff)){
                ans[0] = n + diff;
                ans[1] = n;
            }
        }
        return ans;


    }
}
