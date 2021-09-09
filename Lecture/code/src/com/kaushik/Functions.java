package com.kaushik;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int n1 = in.nextInt();
        System.out.println("Enter the 2nd number");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum is " + sum);

    }
}
