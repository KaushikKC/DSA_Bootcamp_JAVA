package com.kaushik;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
