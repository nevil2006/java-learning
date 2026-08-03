public class In {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Print Spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Print Stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    

