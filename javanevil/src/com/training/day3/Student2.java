package com.training.day3;

import java.util.Scanner;

public class Student2 {

    int rollno;
    String name;
    double cgpa;

    // Default Constructor
    Student2() {
        rollno = 0;
        name = "unknown";
        cgpa = 0.0;
    }

    // Parameterized Constructor
    Student2(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void printDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        int r = sc.nextInt();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double c = sc.nextDouble();

        // Creating object using parameterized constructor
        Student2 s1 = new Student2(r, n, c);

        // Print the values
        s1.printDetails();

        sc.close();
    }
}
