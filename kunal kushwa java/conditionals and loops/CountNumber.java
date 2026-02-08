import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of elements
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();    // reads a number
            if (x == 7) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
