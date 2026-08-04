public class decimal {
    public static void main(String[] args) {

        int n = 13;

        int binary = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * place);
            place = place * 10;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}