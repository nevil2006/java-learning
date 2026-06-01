public class S{
    public static void main(String[] args) {

        int n = 9875;

        while(n >= 10) {   
            int sum = 0;

            while(n > 0) {
                sum = sum + (n % 10);
                n = n / 10;
            }

            n = sum;
        }

        System.out.println("Single digit: " + n);
    }
}