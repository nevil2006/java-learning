package com.training.day3;
import java.util.Scanner;

// NON-STATIC VARIABLES
public class student1 {
    int rollno;
    String name;
    float cgpa;
    char section;
    boolean hostel;

    // DEFAULT CONSTRUCTOR
    student1() {
        rollno = 0;
        name = "null";
        cgpa = 0.0f;
        section = 'n';
        hostel = true;
    }

    // PARAMETERIZED CONSTRUCTOR
    student1(int rollno, String name, float cgpa, char section, boolean hostel) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
        this.section = section;
        this.hostel = hostel;
    }

    // NON-STATIC METHOD
    void print() {
        System.out.println(rollno + "-" + name + "-" + cgpa + "-" + section + "-" + hostel);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rollno (int): ");
        int rollno = sc.nextInt();
        sc.nextLine(); // Clear extra newline

        System.out.print("Enter name (line): ");
        String name = sc.nextLine();

        System.out.print("Enter cgpa (float): ");
        float cgpa = sc.nextFloat();

        System.out.print("Enter section (char): ");
        char section = sc.next().charAt(0);

        System.out.print("Enter hostel (true/false): ");
        boolean hostel = sc.nextBoolean();

        student1 p1 = new student1(rollno, name, cgpa, section, hostel);
        p1.print();

        sc.close();
    }
}
