import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[]) {
        Scanner john = new Scanner(System.in);  // create a Scanner object
        int a = john.nextInt();                 // read first integer
        int b = john.nextInt();  
        int sum =a + b;
        System.out.print("sum=" + sum);               // print sum
        john.close();                           // close Scanner
    }
}
