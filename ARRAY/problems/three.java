import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Print array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Move to next line
        System.out.println();

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}