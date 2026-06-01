package basiccoding;
import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}