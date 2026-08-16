public class avg {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Step 1: Find sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Step 2: Find average
        double average = (double) sum / arr.length;

        // Step 3: Count elements greater than average
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}