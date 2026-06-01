import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        while (n <= 100) {
            if (n % 2 == 0)
                System.out.println(n + " ");
            n++;
        }
    }
}