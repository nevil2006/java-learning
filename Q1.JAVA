import java.lang.System;
import java.util.Scanner;

class Q1{
    public static void main(String args[])
    {
        Scanner  scan= new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine(); // use nextLine() for names

        System.out.print("Enter your age: ");
        int age = scan.nextInt(); // use nextInt() for numbers

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);

        scan.close();
        

    }
}