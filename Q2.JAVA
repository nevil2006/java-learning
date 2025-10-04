import java.util.Scanner;

class Q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your city name: ");
        String cityname = scan.nextLine();

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My address is: " + cityname);

        scan.close();
    }
}
