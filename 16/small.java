public class small {
    public static void main(String[] args) {

        int[] arr = {-5, 3, -2, 8, 1, 0};

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0 && arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
}