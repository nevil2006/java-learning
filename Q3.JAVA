import java.lang.System;
import java.util.Scanner;

class Q3{
    public static void main(String args[]) {
        Scanner john = new Scanner(System.in);  
        int a = john.nextInt();                
        int b = john.nextInt();
        int c = john.nextInt();  
        int sum =a + b + c;
        System.out.print("sum=" + sum);               
        john.close();                           
    }
}