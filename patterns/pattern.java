public class pattern {
		
    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= n - row + 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}