import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[]) {
        Scanner john = new Scanner(System.in);  // take input from keyboard
        int a = john.nextInt();                 // read an integer
        System.out.println("You entered: " + a);
        john.close();                           // always close Scanner
    }
}
