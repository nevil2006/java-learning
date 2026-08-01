import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int n = arr.length;
        k = k % n;

        // Step 1: Reverse the entire array
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reversing entire array:");
        System.out.println(Arrays.toString(arr));

        // Step 2: Reverse first k elements
        start = 0;
        end = k - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reversing first " + k + " elements:");
        System.out.println(Arrays.toString(arr));

        // Step 3: Reverse remaining elements
        start = k;
        end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reversing remaining elements:");
        System.out.println(Arrays.toString(arr));
    }
}