package com.training.day5;

public class Student {
    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row <= n; row++) {
            for (int col = n; col >= row + 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
