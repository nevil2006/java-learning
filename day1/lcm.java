import java.util.*;

public class lcm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while(y != 0) {

            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;

        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}