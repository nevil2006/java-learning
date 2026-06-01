import java.util.Scanner;

public class thre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int a = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.nextLine(); 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Left-to-right evaluation examples
        System.out.println(a + name);          // int + String → String
        System.out.println(name + b + c);      // String first → String
        System.out.println(name + (b + c));    // brackets control order

        sc.close();
    }
}
