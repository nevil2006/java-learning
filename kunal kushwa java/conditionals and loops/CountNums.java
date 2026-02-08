
public class CountNums {
    public static void main(String[] args) {

        int n = 45536;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;   // get last digit

            if (rem == 5) {
                count++;
            }

            n = n / 10;        // remove last digit
        }

        System.out.println("Count of 5 = " + count);
    }
}
