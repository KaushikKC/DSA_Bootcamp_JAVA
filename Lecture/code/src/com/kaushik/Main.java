package com.kaushik;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "apple" -> System.out.println("Nice red fruit");
            case "bannana" -> System.out.println("yellow fruit");
            case "orange" -> System.out.println("orange fruit");
            default -> System.out.println("invalid fruit!!");
        }

    }
}
