public class matrix {

    public static void main(String[] args) {

        int[][] arr = {
            {1,2},
            {3,4}
        };

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Sum = " + sum);
    }
}