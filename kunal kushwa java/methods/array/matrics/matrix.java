import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        // Input matrix
        for (int row1 = 0; row1 < arr.length; row1++) {
            for (int col1 = 0; col1 < arr[0].length; col1++) {
                arr[row1][col1] = sc.nextInt();
            }
        }

        // Print matrix in bracket format
        for (int row1 = 0; row1 < arr.length; row1++) {

            System.out.print("[");   // start bracket

            for (int col1 = 0; col1 < arr[0].length; col1++) {
                System.out.print(arr[row1][col1]);

                // print comma except last element
                if (col1 < arr[0].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("]"); // end bracket
        }

    }
}