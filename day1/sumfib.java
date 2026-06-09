import java.util.*;

public class sumfib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            sum += a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}