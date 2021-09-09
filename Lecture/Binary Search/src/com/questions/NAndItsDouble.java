package com.questions;

import java.util.ArrayList;
import java.util.List;

public class NAndItsDouble {
    public static void main(String[] args) {

    }

    static boolean check(int[] arr){
        List<Integer> list = new ArrayList<>();

        for(int num: arr) {
            if((list.contains(num*2)) || (num%2 ==0 && list.contains(num/2))) {
                return true;
            }
            else {
                list.add(num);
            }
        }
        return false;
    }
}
