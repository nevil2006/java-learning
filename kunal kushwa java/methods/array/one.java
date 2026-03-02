import java.util.*;

class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // array size
        int[] arr = new int[n];

        // take array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print in bracket format
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
}