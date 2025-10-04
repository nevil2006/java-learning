import java.util.Scanner;

class Q4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your score: ");
        String score = scan.nextLine();   // take score as text (e.g., "7.5/10")

        System.out.print("Enter your department name: ");
        String departmentname = scan.nextLine();

        System.out.println("My name is: " + name);
        System.out.println("My Score is: " + score);
        System.out.println("My Department is: " + departmentname);

        scan.close();
    }
}
