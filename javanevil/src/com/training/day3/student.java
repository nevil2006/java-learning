package com.training.day3;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);  // Read a single character
        System.out.println(ch);

        sc.close();
    }
}
