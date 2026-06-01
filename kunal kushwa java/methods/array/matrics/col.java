public class col {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {2, 3},
            {8, 9, 0, 7}
        };

        for (int row = 0; row < arr.length; row++) {

            System.out.print("[");   

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);

                
                if (col < arr[row].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("]"); 
        }
    }
}