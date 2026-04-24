import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while(n > 0) {
            int digit = n % 10;
            rev +=digit*digit*digit; 
            n = n / 10;
        }

        if(original == rev) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}