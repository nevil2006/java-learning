import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next(); // single word

        System.out.println("My age is: " + age);
        System.out.println("My name is: " + name);

        sc.close();
    }
}
