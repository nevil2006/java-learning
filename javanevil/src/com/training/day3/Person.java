package com.training.day3;

import java.util.Scanner;

// Create class Person
public class Person {

    // Instance variables (non-static → belong to object)
    String name;
    int age;
    char gender;

    // Parameterized constructor
    // This runs automatically when we create an objecthttps://meet.google.com/jka-vegy-owp
    Person(String name, int age, char gender) {
        // this → refers to current object
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Non-static method (requires an object to call it)
    void printDetails() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Name: ");
        String n = sc.nextLine(); // Read full name

        System.out.print("Enter Age: ");
        int a = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char g = sc.next().charAt(0);

        // Creating object → calls constructor
        Person p = new Person(n, a, g);

        // Calling non-static method using object
        p.printDetails();

        sc.close();
    }
}
