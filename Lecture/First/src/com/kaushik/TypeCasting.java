package com.kaushik;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        float num = intput.nextFloat();
        int num1 = (int)(num);
        System.out.println(num1);
    }
}
