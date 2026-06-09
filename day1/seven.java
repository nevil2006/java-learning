import java.util.*;

public class seven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++) {

            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}