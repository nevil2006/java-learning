import java.util.Scanner;

public class summatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        int sum = 0; // declare sum

        System.out.println("Enter matrix elements:");

        for (int row1 = 0; row1 < arr.length; row1++) {
            for (int col1 = 0; col1 < arr[row1].length; col1++) {

                arr[row1][col1] = sc.nextInt(); // take input
                sum = sum + arr[row1][col1];    // add to sum

            }
        }

        System.out.println("Sum of matrix = " + sum);

        sc.close();
    }
}